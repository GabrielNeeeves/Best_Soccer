// LOGIN //
const formularioLogin = document.querySelector("#login");
const usuarioNomeLogin = document.querySelector("#usuarioNomeLogin");
const usuarioSenhaLogin = document.querySelector("#usuarioSenhaLogin");

// FUNÇÃO MANDAR DADOS DO LOGIN PARA A API //
function login() {

    fetch("http://localhost:8080/usuarios",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome: usuarioNomeLogin.value,
            senha: usuarioSenhaLogin.value
        })
    })
    .then(function (res) {console.log(res)})
    .catch(function (res) {console.log(res)})
};

function limparLogin() {
    usuarioNomeLogin.value = "";
    usuarioSenhaLogin.value = "";
}

formularioLogin.addEventListener('submit', function(event) {
    event.preventDefault();

    login();
    limparLogin();
})


// CADASTRAR //
const formularioCadastro = document.querySelector("#cadastro");
const adminNomeCadastro = document.querySelector("#usuarioNomeCadastro");
const adminEmailCadastro = document.querySelector("#usuarioEmailCadastro");
const adminSenhaCadastro = document.querySelector("#usuarioSenhaCadastro");

// FUNÇÃO MANDAR DADOS DO CADASTRO DE ADMIN PARA A API //
function cadastroAdmin() {

    fetch("http://localhost:8080/admins", 
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome: adminNomeCadastro.value,
            email: adminEmailCadastro.value,
            senha: adminSenhaCadastro.value
        })
    })
    .then(function (res) {console.log(res)})
    .catch(function (res) {console.log(res)})
};


function limparCadastro() {
    adminNomeCadastro.value = "";
    adminEmailCadastro.value = "";
    adminSenhaCadastro.value = "";
};

formularioCadastro.addEventListener('submit', function(e) {
    e.preventDefault();

    cadastroAdmin();
    limparCadastro();
})
