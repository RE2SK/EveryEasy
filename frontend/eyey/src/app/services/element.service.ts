import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { IElement } from '../interfaces/interfaces';

@Injectable({
  providedIn: 'root'
})

//https://www.angularjswiki.com/httpclient/observable/

export class ElementService {

  base_url = "localhost:8082"

  constructor(private http: HttpClient) { }

  public getAllElements(): Observable<IElement[]> {
    return this.http.get<IElement[]>(this.base_url)
  }

  public getOneElement(): Observable<IElement> {
    return this.http.get<IElement>(this.base_url + "/id")
  }

  public addElement(element: any): Observable<IElement> {
    return this.http.post<IElement>(this.base_url, element)
  }

  public deleteElement(): Observable<IElement> {
    return this.http.delete<IElement>(this.base_url + "/id")
  }

  public editElement(element: any): Observable<IElement> {
    return this.http.put<IElement>(this.base_url + "/id", element)
  }
}