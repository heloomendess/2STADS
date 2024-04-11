console.log('carregar dados')

const tarefas = JSON.parse(localStorage.getItem('tarefas')) || []

tarefas.forEach((tarefa) => {
    const card = document.createElement("div")
    document.querySelector('#lista-de-tarefas').appendChild(card)
})