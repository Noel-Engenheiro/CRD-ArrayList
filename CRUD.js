//Fazer um CRUD front end no JS;

//Seleção de Elementos

const todoForm = document.querySelector("#todo-form");
const todoInput = document.querySelector("#todo-input");
const todoInput2 = document.querySelector("#todo-input2");
const todoInput3 = document.querySelector("#todo-input3");
const todoInput4 = document.querySelector("#todo-input4");
const todoList = document.querySelector("#todo-list");
const editForm = document.querySelector("#edit-form");
const editInput = document.querySelector("#edit-input");
const cancelEditBtn = document.querySelector("#cancel-edit-btn");

let oldInputValue;

//Funções
const saveTodo = (text) =>{
    const todo = document.createElement("div");
    todo.classList.add("todo");
   
    const todoTitle = document.createElement("h3");
    todoTitle.innerText = text;
    todo.appendChild(todoTitle);

    const doneBtn = document.createElement("button")
    doneBtn.classList.add("finish-todo")
    doneBtn.innerHTML = '<i class= "fa-solid fa-check"></i>'
    todo.appendChild(doneBtn)

    const editBtn = document.createElement("button")
    editBtn.classList.add("edit-todo")
    editBtn.innerHTML = '<i class= "fa-solid fa-pen"></i>'
    todo.appendChild(editBtn)

    const deleteBtn = document.createElement("button")
    deleteBtn.classList.add("remove-todo")
    deleteBtn.innerHTML = '<i class= "fa-solid fa-xmark"></i>'
    todo.appendChild(deleteBtn)

    todoList.appendChild(todo)
    
    todoInput.value = ""; 
    todoInput.focus();

};

const toggleForms = () =>{
    editForm.classList.toggle("hide");
    todoForm.classList.toggle("hide");
    todoList.classList.toggle("hide");
};

const updateTodo = (text) => {
    const todos = document.querySelectorAll(".todo")

    todos.forEach((todo) => {
        let todoTitle = todo.querySelector("h3")

        if(todoTitle.innerText === oldInputValue) {
            todoTitle.innerText = text;
        }
    });

};

//Eventos

todoForm.addEventListener("submit",(e) =>{
 e.preventDefault();

    const inputValue = todoInput.value
    if(inputValue){
     saveTodo  (inputValue)
    }
});

todoForm.addEventListener("submit",(e) =>{
    e.preventDefault();
   
       const inputValue2 = todoInput2.value
       if(inputValue2){
        saveTodo  (inputValue2)
       }
   });
   

todoForm.addEventListener("submit",(e) =>{
    e.preventDefault();
   
       const inputValue3 = todoInput3.value
       if(inputValue3){
        saveTodo  (inputValue3)
       }
   });

todoForm.addEventListener("submit",(e) =>{
    e.preventDefault();
   
       const inputValue4 = todoInput4.value
       if(inputValue4){
        saveTodo  (inputValue4)
       }
   });

document.addEventListener("click", (e) => {
    const targetEl = e.target;
    const parentEl = targetEl.closest("div");
    let todoTitle;

    if(parentEl && parentEl.querySelector("h3")){
        todoTitle = parentEl.querySelector("h3").innerText;
    }

    if(targetEl.classList.contains("finish-todo")){
        parentEl.classList.toggle("done");
    }

    if(targetEl.classList.contains("remove-todo")){
        parentEl.remove();
    }

    if(targetEl.classList.contains("edit-todo")){
        toggleForms();

        editInput.value = todoTitle;
       oldInputValue = todoTitle;
    }
});

cancelEditBtn.addEventListener("click", (e) => {
    e.preventDefault();
    toggleForms();
} );

editForm.addEventListener("submit", (e) => {
    
    e.preventDefault()
    
    const editInputValue = editInput.value;

    if(editInputValue) {
        updateTodo(editInputValue)
    }

    toggleForms()
})

