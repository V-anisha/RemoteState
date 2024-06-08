let todos = [];
//creating array to add the tasks

function addTodo() {
    const newTodoInput = document.getElementById('new-todo');
    const newTodoText = newTodoInput.value.trim();
    
    if (newTodoText === '')
        return;
    //if the task is empty it wil return

    const newTodo = {
        id: Date.now(),  //saving the task with date as an unique id
        text: newTodoText
    };

    todos.push(newTodo);
    newTodoInput.value = ''; //clears the i/p field
    Todos(); //DISPLAY
}

function Todos() {
    const todoList = document.getElementById('todo-list');
    todoList.innerHTML = '';

    todos.forEach(todo => {
        const li = document.createElement('li');
        li.dataset.id = todo.id;

        const span = document.createElement('span');
        span.textContent = todo.text;

        const input = document.createElement('input');
        input.type = 'text';
        input.value = todo.text;
        input.style.display = 'none';

        const editButton = document.createElement('button');
        editButton.textContent = 'Edit';
        editButton.className = 'edit-btn';
        editButton.onclick = () => editTodoStart(li, span, input, editButton, saveButton);

        const saveButton = document.createElement('button');
        saveButton.textContent = 'Save';
        saveButton.className = 'save-btn';
        saveButton.onclick = () => editTodoSave(todo.id, span, input, li);

        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.onclick = () => deleteTodo(todo.id);

        li.appendChild(span);
        li.appendChild(input);
        li.appendChild(editButton);
        li.appendChild(deleteButton);
        todoList.appendChild(li);
    });
}

function editTodoStart(li, span, input, editButton, saveButton) {
    li.classList.add('editing');
    span.style.display = 'none';
    input.style.display = 'inline-block';
    editButton.style.display = 'none';
    saveButton.style.display = 'inline-block';
}

function editTodoSave(id, span, input, li) {
    const newText = input.value.trim();
    if (newText === '') return;

    const todo = todos.find(todo => todo.id === id);
    if (todo) {
        todo.text = newText;
        span.textContent = newText;
    }

    li.classList.remove('editing');
    span.style.display = 'inline-block';
    input.style.display = 'none';
    li.querySelector('.edit-btn').style.display = 'inline-block';
    li.querySelector('.save-btn').style.display = 'none';

    Todos();
}

function deleteTodo(id) {
    todos = todos.filter(todo => todo.id !== id);
    Todos();
}