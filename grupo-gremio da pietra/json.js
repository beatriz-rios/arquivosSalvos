function json(){
    var form_js = {
    nome: "",
    email: "",
    telefone: "",
    idade: "",
    turma: "",
    esporte: "",
    escolha: "",

}

var el_nome = document.getElementById("nome");
form_js.nome = el_nome.value;
var el_email = document.getElementById("email");
form_js.email = el_email.value;
var el_telefone = document.getElementById("telefone");
form_js.telefone = el_telefone.value;
var el_idade = document.getElementById("idade");
form_js.idade = el_idade.value;
var el_turma = document.getElementById("turma");
form_js.turma = el_turma.value;
var el_esporte = document.getElementById("esporte");
form_js.esporte = el_esporte.value;
var el_escolha = document.querySelector('input[name="escolha"]:checked');
form_js.escolha = el_escolha.value;

var json = JSON.stringify(form_js, null, "");
document.write("<h1>BANCO DE DADOS JSON</h1>");
document.write(json);
}