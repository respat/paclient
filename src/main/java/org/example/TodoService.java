/*
 * File: TodoService.java
 * Author: Resperger Patrik
 * Copyright: 2024, Resperger Patrik
 * Group: Szoft II/1/E
 * Date: 2024-01-15
 * Github: https://github.com/respat/
 * Licenc: GNU GPL
 */


package org.example;

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodos() {
        return client.get(url);
    }
}