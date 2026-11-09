
/*const nome = "Nuno";
const idade = 25;
const curso = "Software Developer";
let inscrito = true;
let saldo = 100;
let num1 = 20, num2 = 6;


console.log("A variavel saldo usa let porque esta pode sofrer alterações.");

console.log(inscrito ? `O ${nome} esta inscrito no curso ${curso} e tem ${idade}` : "Não estas inscrito");

console.log(`Saldo = ${saldo + (50 - 20)}`);

console.log("Soma: " + (num1 + num2) + "\nSubtração: " + (num1 - num2) + "\nDivisão: " + (num1 / num2) + "\nMultiplicação: " + (num1 * num2) + "\nResto: " + (num1 % num2));*/

/*let nota = parseInt(prompt("Insira um numero"));


    
if(nota >= 0 && nota <= 9){
    console.log("Não aprovou.");
    }else if(nota >= 10 && nota <= 13){
        console.log("Suficiente");
    }else if(nota >= 14 && nota <= 17){
        console.log("Bom");
    }else if(nota >= 18 && nota <= 20){
        console.log("Muito Bom");
    }else if(nota < 0 || nota > 20){
        console.log(`${nota} não é uma nota válida.`);
    }*/

/*let sum = 0;

for(let i = 1; i <= 10; i++){

    if(i % 2 == 0){
        console.log(i)
    }
    if(i <= 5){
        sum += i;
    }
    
}

console.log(sum);*/



/*function isEven(a){
    let paridade = false;
    if(a % 2 == 0){
           paridade = true;
    }
     
    return paridade;
}

function calculateDescont(price , percentage){
    
    if(percentage > 0.0 && percentage <= 1.0) return price * percentage;
}

console.log(isEven(calculateDescont(20, 0.5)) ? `O numero ${calculateDescont(20, 0.5)} é par` : `O numero ${calculateDescont(20, 0.5)} não é par`)*/

function calcularMedia(a, b){
    return (a + b) / 2;
}

function Tabuada(a){
    for(let i = 1; i <= 10; i++){
         console.log(`${a} * ${i} = ${a * i}`);
    }
}


let nome = prompt("Insira o seu nome: ");
let notaTeste = parseInt(prompt("Insira nota do teste"));
let notaProjeto = parseInt(prompt("Insira nota do projeto"));
let media = 0.0;

media = Math.floor(calcularMedia(notaTeste, notaProjeto))

console.log(`Media = ${media}`);

console.log(media > 9 ? `O aluno ${nome} foi aprovado com uma media de ${media}` : `O aluno ${nome} reprovou.`)

Tabuada(media);

let size = parseInt(prompt("Insira o tamanho do array: "));
let numeros = new Array(size);

for(let i = 0; i < numeros.length; i++){
    numeros[i] = parseInt(Prompt("Insira um numero: "));
    alert(numero[i]);
} 

let date = new Date();