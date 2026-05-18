# Sistema de Contratos e Produtividade (Java)

Este é um sistema de console desenvolvido em Java para consolidar dados financeiros de colaboradores e gerenciar múltiplos contratos por hora associados a um trabalhador. 

O projeto aplica conceitos práticos e fundamentais da **Programação Orientada a Objetos (POO)**, com foco principal na relação de composição entre objetos e manipulação de enumerações.

##  Melhorias Implementadas
* **Java Time API:** Diferente de abordagens tradicionais que utilizam a classe antiga `Date`, este projeto foi desenvolvido utilizando `LocalDate` e `DateTimeFormatter` (`java.time`), aplicando as práticas modernas de mercado para manipulação de datas no ecossistema Java.

##  Tecnologias e Conceitos Aplicados

* **Linguagem:** Java
* **Programação Orientada a Objetos (POO):** Classes, atributos, métodos, construtores e encapsulamento.
* **Composição de Objetos:** Implementação de relacionamentos do tipo "tem-um" (Trabalhador possui um Departamento) e "tem-vários" (Trabalhador possui uma lista de Contratos).
* **Enumerações (Enums):** Utilização do `WorkerLevel` para determinar o nível de senioridade do colaborador.
* **Estruturas de Dados:** Uso de listas dinâmicas (`List`) para o armazenamento e manipulação dos contratos.
* **Lógica Backend:** Métodos matemáticos para filtragem e cálculo de somatórios baseados no mês e ano informados pelo usuário.

##  Como Funciona a Execução

O programa interage com o usuário via terminal solicitando:
1. O nome do departamento.
2. Dados básicos do trabalhador (Nome, Nível de senioridade e Salário base).
3. A quantidade de contratos que este trabalhador possui.
4. Os dados específicos de cada contrato (Data de vigência, valor recebido por hora e quantidade de horas trabalhadas).
5. O mês e ano alvo para o cálculo financeiro.

Ao final, o sistema filtra os contratos pertencentes àquele período, calcula o valor acumulado das horas e soma ao salário base, exibindo o demonstrativo consolidado de rendimentos.

##  Autor
* **Felipe Nunes Zaratini**
