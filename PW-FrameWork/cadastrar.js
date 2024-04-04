document.querySelector("#botao-cadastrar") 
.addEventListener("click", () => {

    const form = document.querySelector("form")

    const tarefa = {
        titulo : form.titulo.value,
        descricao : form.descricao.value,
        pontos : form.pontos.value
    }

    validar(tarefa)

})

function validar(tarefa) {
    limparErros()
    if(tarefa.titulo === "") {
        document.querySelector("#titulo").classList.add("is-error")
        document.querySelector("#titulo-error").innerText = "O título é obrigatório"
    } 
    if(tarefa.descricao === "") {
        document.querySelector("#descricao-error").innerText = "A descrição é obrigatória"
        document.querySelector("#descricao").classList.add("is-error")
    } 
}

function limparErros() {
    document.querySelector("#titulo-error").innerText = "";
    document.querySelector("#titulo").classList.remove("is-error");
}