package com.if67k.java.todolist;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caroline
 */

public class JavaTodo {
     ArrayList<String> todoList = new ArrayList();
   
    private void getList(){
        todoList.forEach(System.out::println);
    }
    
    private void addTask(String task){
        todoList.add(task);
    }
    
    private void clearTask(){
        todoList.clear();
    }
        
    public static void main(String[] args) {
        // Metodo 01:
        JavaTodo javaTodo = new JavaTodo();
        javaTodo.addTask("Dormir");
        javaTodo.addTask("Acordar");
        javaTodo.getList();
        javaTodo.clearTask();
    }
}
