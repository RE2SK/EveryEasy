import { Timestamp } from "rxjs"

export interface IElement {
    data: any[]
    id?: String,
    name: String,
    simpleDescription: String,
    extendedDescription: String,
    createdByEmail: String,
    state: boolean
}

export interface IChat {
    id?: String,
    participant1Id: String,
    participant2Id: String,
    date: String,
    timestamp: String
}

export interface IMessage {
    id?: String,
    chatId: String,
    content: String,
    date: String,
    timestamp: String
}

export interface IUserdata {
    id?: String,
    username: String,
    email: String
}