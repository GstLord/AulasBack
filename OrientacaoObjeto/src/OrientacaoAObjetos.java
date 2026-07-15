/*
---------------------------------------------------------------------OBJETOS-----------------------------------------------------------------------------------------------

Objetos são qualquer elemento concreto ou abstrado que existe no mundo real, que se pode individualizar por possuir comportamentos e caracteristicas próprios.

Objetos Abstratos: Objetos não palpáveis, não físicos, porém que possuem atributos e métodos(que é o principal para ser considerado um objeto), como exemplo
conta bancária ou transação financeira, existem tanto atributos como saldo, titular, datas e valores, quanto métodos(ações), como sacar, depositar, verificar transação e etc.

Objetos Concretos: Objetos fisicos, como um carro ou até mesmo uma pessoa que possuem atributos e métodos dentro do sistema.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                       CLASSE X OBJETO
                                                       CLASSE = MOLDE
                                                       OBJETO = ELEMENTO CRIADO A PARTIR DO MOLDE

---------------------------------------------------------------------CLASSES-----------------------------------------------------------------------------------------------

Classes representam a abstração de um conjunto de objetos do mundo real que possuem caracteristicas e comportamentos em comum

Atributos: É uma caracteristica particular que os objetos de uma classe possuem, assumindo valores diferentes para cada   objeto - Tamanho, Raça, Nome(São atributos que todos
os cachorros de uma classe cães tem, mesmo podendo ser atributos diferentes)

Métodos/Operações: é um comando que faz o objeto executar uma ação. As operações são tudo o que os objetos de uma classe fazem. Metodo a lógica interna de uma operação
como - Latir comer, correr e etc.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------INSTÂNCIA----------------------------------------------------------------------------------------------

Instanciar uma classe é a materialização ou realização completa de uma classe modelo(A classe é a receita. A instância é o bolo pronto.)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------MENSAGEM---------------------------------------------------------------------------------------------

É o mecanismo de chamada de uma operação. É utilizada na solicitação de execução de uma operação. É a maneira como conseguimos que um metodo seja executado.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------COLABORAÇÂO------------------------------------------------------------------------------------------

Colaboração: É a troca de mensagens que acontece entre objetos e atores.
Evento: è um tipo especial de operação que faz com que objetos mudem de estado.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------PARÂMETRO----------------------------------------------------------------------------------------

Parâmetro: É um ou mais atributos que são carregados para dentro de uma mensagem. São os dados que um metodo espera receber para realizar uma tarefa.
Estado: É a forma de apresentação dos objetos de uma classe em determinado instante.

---------------------------------------------------------------------------------ASSOCIAÇÃO--------------------------------------------------------------------------------------

É a forma como os objetos de uma mesma classe ou classes diferentes se conectam. É quando uma classe utiliza ou se relaciona com outra classe.
E existem: Simples, Bidirecional, Agregação, Composição

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


-------------------------------------------------------------------------ABSTRAÇÃO-----------------------------------------------------------------------------------------------

Um objeto conceitual partindo de objetos do mundo real com os mesmo comportamentos e caracteristicas.
Identifica e modela as caracteristicas e comportamentos essenciais de um objeto.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------HERANÇA-------------------------------------------------------------------------------------------

Possibilita que uma classe herde caracteristicas e comportamentos de outra classe.
Permite atender á mudanças nas especificações sem mexer em codigo ja pronto.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------ENCAPSULAMENTO-----------------------------------------------------------------------------------------------

É a reunião de caracteristicas e comportamentos de objetos em uma classe.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------POLIMORFISMO-----------------------------------------------------------------------------------------------
É a capacidade que objetos de classes diferentes possuem de se comportarem de forma diferente em uma mesma operação. A estrutura(atributos)  de cada classe é diferente.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
                    //L E M B R A R   D E   I M P O R T A R   A S   C L A S S E S
import com.orientacaoobjetos.entity.Pessoa;
import com.orientacaoobjetos.entity.Professor;

/*classe*/
public class OrientacaoAObjetos {
    public static void main(String[] args){//metodo

                    //esta guardado na memoria heap
        Professor professor1 = new Professor();  //ISSO É UMA INSTANCIA, ESTOU INSTANCIANDO O OBJETO professor
        professor1.nome = "Gustavo";
        professor1.escola = "EBAC";
        professor1.idade = 23;
        professor1.materia = "JAVA";

        Professor professor2 = new Professor();
        professor2.nome = "Jhon";
        professor2.escola = "EBAC";
        professor2.idade = 35;
        professor2.materia = "REACT";

        System.out.println(professor1);
        System.out.println(professor2);


        //UTILIZANDO OS METODOS DA CLASSE PROFESSOR
        professor1.lecionarMateria();
        professor1.finalizarMateria();
        professor2.lecionarMateria();
        professor2.finalizarMateria();

        //CRIAÇÃO DE CLASSES USANDO ENCAPSULAMENTO
        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);

        System.out.println(pessoa1);
        System.out.println(pessoa2);

    }
}