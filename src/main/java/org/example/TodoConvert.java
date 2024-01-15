/*
 * File: TodoConvert.java
 * Author: Resperger Patrik
 * Copyright: 2024, Resperger Patrik
 * Group: Szoft II/1/E
 * Date: 2024-01-15
 * Github: https://github.com/respat/
 * Licenc: GNU GPL
 */

package org.example;
import java.util.ArrayList;

import hu.szit.Convert;

public class TodoConvert {
    public TodoConvert() {
        TodoService todoService = new TodoService();
        String todos = todoService.getTodos();

        ArrayList<Todos> todoList = Convert.toListObject(todos, Todos.class);
        for (Todos todo : todoList) {
            System.out.println(todo.title);
        }
    }
}
