import { Component, OnInit } from '@angular/core';
import { IElement } from 'src/app/interfaces/interfaces';
import { ElementService } from 'src/app/services/element.service';

@Component({
  selector: 'app-element',
  templateUrl: './element.component.html',
  styleUrls: ['./element.component.css']
})
export class ElementComponent implements OnInit {

  elements = new Array<IElement>();

  constructor(public elementService: ElementService) { }

  ngOnInit(): void {
    this.elementService.getAllElements().subscribe(data => {
      this.elements = data;
    })
  }
}
