package com.example.recycleview

class UserDto {
    var country: String = ""
    var city: String = ""

    constructor() {}

    constructor(name: String, comment: String) {
        this.country = name
        this.city = comment
    }
}