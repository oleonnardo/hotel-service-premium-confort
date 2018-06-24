<h2 align="center">Projeto Hotel Campina Confort Premium</h2>

<p align="center">
Professor: Danilo Abreu<br>
Laboratório de Programação<br>
Leonardo Araujo Silva<br>
<br>
Link da apresentação do projeto: <a href="#" target="_blank">clique aqui</a>
</p>

## Sobre o Projeto

<p>Um hospede representa um cliente do hotel, contendo informações do mesmo, tais como nome, cpf e data de nascimento. Cada hospede estará associado a um dos contratos
gerenciados pelo hotel. Deve ser possível criar, pesquisar, atualizar informações de um hóspede. O hotel disponibiliza um conjunto de serviços para seus hóspedes. Esses serviços são incluídos nos contratos e englobam os quartos (serviço básico) e serviços adicionais
como aluguel de carros, babysitter e restaurante.</p>

<p>O hotel gerencia seus serviços por meio de contratos. Cada contrato está associado a um hóspede, inclui um conjunto de serviços e é válido por um período de tempo que
inclui a data de entrada do hóspede e quantas noites ele ficará hospedado. Além disso, deve ter um número de cartão de crédito por segurança, para garantir o pagamento no checkout.</p>


## MVC (Model, View, Controller)

<strong>View:</strong> é o responsável por apresentar os resultados na interface;<br>
<strong>Controller:</strong> faz <i>dispatches</i> para quem deve executar determinada tarefa;<br>
<strong>Model:</strong> são as classes que representam suas entidades e as que te ajudam a armazenar e buscar os dados.<br>

<p>
Esses três formam um padrão arquitetural chamado de MVC, ou Model View Controller. Ele pode sofrer variações de diversas maneiras. O que o MVC garante é a separação de tarefas, facilitando assim a reescrita de alguma parte, e a manutenção do código. </p>

## Estrutura do Projeto

- Classes
- Controllers
- Models
- Public
- Views

## Classes

- class <strong>DataHora</strong> [Classe com funções das classes Calendar, Date, DateFormat e SimpleDateFormat];
- class <strong>Flash</strong> [Classe com funções para a utilização do JOptionPane];
- class <strong>Generator</strong> [Classe que possui funções para gerar um sequencial para a matricula e id dos cadastros];
- class <strong>Numeros</strong> [Classe que controla a exibição e formatação de jTextFields nas interfaces e controle de casas decimais em números do tipo float];
- class <strong>RequisitosFuncionais</strong> [Classe que possui todos os requisitos do projeto Minha Instituição, com alguns deles é possivel manipular ações da aplicação];
	
	
## Controllers


- class <strong>AlunoController</strong> 
- class <strong>AlunoTurmaController</strong>
- interface <strong>Controllers</strong> 
- class <strong>DisciplinaController</strong>
- class <strong>HistoricoAlunoController</strong> 
- class <strong>ProfessorController</strong> 
- class <strong>TurmaController</strong> 

## Models

- class <strong>Aluno</strong> 
- class <strong>AlunoTurma</strong>
- class <strong>Disciplina</strong>
- class <strong>HistoricoAluno</strong> 
- class <strong>Professor</strong> 
- class <strong>Turma</strong> 

## Public

- (Flash, Icons, Images, lib, Logos)

## Views

- [package <strong>membros</strong>]: class <strong>Alunos</strong> extends javax.swing.JInternalFrame
- [package <strong>membros</strong>]: class <strong>Professores</strong> extends javax.swing.JInternalFrame
- class <strong>Creditos</strong> extends javax.swing.JInternalFrame
- class <strong>Disciplinas</strong> extends javax.swing.JInternalFrame 
- class <strong>HistoricoAluno</strong> extends javax.swing.JInternalFrame 
- class <strong>MatriculaNotasAlunos</strong>  extends javax.swing.JInternalFrame 
- class <strong>MembrosInstituição</strong>  extends javax.swing.JInternalFrame 
- class <strong>Principal</strong> extends javax.swing.JFrame 
- class <strong>Turmas</strong> extends javax.swing.JInternalFrame 


