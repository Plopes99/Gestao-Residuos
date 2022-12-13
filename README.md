# Gorod – Gestão de Resíduos Urbanos

## Introdução

No âmbito desta disciplina, Programação II foi proposto a realização de uma aplicação sobre Gestão de Resíduos Urbanos – Gorod. Assim, o presente relatório tem como principal objetivo a aplicação concreta das metodologias e conhecimentos aprendidos e aplicados nas aulas da Unidade Curricular (onde aprendemos linguagem JAVA), bem como nos conhecimentos aprendidos na disciplina de Engenharia de Software I. Quanto à estrutura, este relatório encontra-se dividido em três partes, sendo a primeira referente à introdução, onde é referido os principais objetivos do trabalho. Na segunda parte, o desenvolvimento propriamente dito. A última parte, corresponde à conclusão, onde são consideradas, através de uma metodologia reflexiva, todas as aprendizagens adquiridas, analisando se todos os objetivos foram cumpridos.

## Desenvolvimento de Software

O desenvolvimento deste projeto, inicializa-se numa primeira fase que se foca na identificação de todas as informações relevantes para o bom funcionamento e desenvolvimento da aplicação. Comecei por identificar os principais utilizadores desta aplicação, que são o Administrador, o Gestor (Gestor de Parques de Contentores), o Município (Administrador de Município) e por último, a Equipa (Equipa de Limpeza e Resíduos) que é representada por um chefe de equipa (que é quem vai ter acesso à aplicação).  
No entanto, cada um destes utilizadores, têm funções específicas. Tais como:

### Administrador  

É quem gere todos os utilizadores, acabando por ser o
utilizador mais importante da aplicação, uma vez que se ele não criar os outros
utilizadores, estes não poderão aceder à mesma uma vez que não é possível
fazer o próprio registo. Tem como funções:

* ✓Criar Utilizadores;
* ✓ Criar, listar e alterar dados de Tipos de Resíduos.

### Município

Faz a gestão de todos os trabalhadores do seu Município e
Parques de Contentores.

* ✓ Criar, listar e alterar Parques de Contentores;
* ✓ Atribuir Parques de Contentores a gestores;
* ✓ Criar, listar e alterar Trabalhadores do seu Município, embora estes,
utilizem a aplicação

### Gestor
Gere as Ordens de Serviço e os Contentores dos Parques de
Contentores que lhes foram distribuídos pelo Município.

* ✓ Listar Parques de Contentores que gere;
* ✓ Criar Contentores dos Parques de Contentores que gere;
* ✓ Consultar e alterar dados dos Parques de Contentores;
* ✓ Consultar lista de Contentores e o estado de cada um deles;
* ✓ Criar e listar Ordens de Serviço.

### Equipa
Faz a Recolha de Resíduos, cumprindo as ordens de serviço que
lhes foram atribuídas.

* ✓ Listar Ordens de Serviço;
* ✓ Atualizar estado de Ordens de Serviço;
* ✓ Pesquisar Parques de Contentores.

## Diagrama de Casos de Uso

Foi criado um Diagrama de Casos de Uso, com todas as funcionalidades analisadas no
desenvolvimento de software.
![image](https://user-images.githubusercontent.com/61700999/207396807-8b399aff-eae6-4288-9123-f2acdc0330d8.png)

Numa última fase, desenvolveu-se a parte do código da aplicação. Este código, como foi
dito na introdução deste trabalho, é desenvolvido em linguagem Java (linguagem aplicada a
objetos), criada no programa NetBeans.  
A parte de código desta aplicação, foi dividida em duas partes. A primeira é a BLL
(Business Logic Layer), que se foca na criação de todas as classes utilizadas ao longo do
desenvolvimento desta aplicação. E a segunda é a GUI (Graphical User Interfaces).  
Relativamente à primeira parte, comecei por criar todas as classes necessárias para o
desenvolvimento da aplicação. Criei a classe Utilizador, que tem como subclasses o Gestor,
Administrador, Equipa e Município (através do extend).  
De seguida, tive de criar uma classe Repositório onde são guardados todos os dados
referentes a todas as classes criadas, de maneira a tornar o código mais organizado e de maior
facilidade de compreensão.  Após a criação de todas as classes, com os respetivos construtores, getters e setters e
atributos, procedeu-se à realização da interface gráfica da aplicação, onde também é
implementado todos os métodos, isto é, funções para as funcionalidades da aplicação em si.

## Manual de Utilizador

Ao aceder à aplicação o utilizador, depara-se com a entrada da aplicação, como está
apresentada na figura 2. Ao clicar na opção “Entrar”, acede à janela de login do utilizador. Caso
clique no botão “Sair”, o utilizador sai da aplicação.

![image](https://user-images.githubusercontent.com/61700999/207397142-23d5ec9c-2191-4f1e-abea-8198d3c4b001.png)

Na janela do login do utilizador, apenas consegues aceder o utilizador que já estiver
registado pelo administrador, ou seja, já tenha uma conta criada pelo administrador. Como
existem vários tipos de utilizadores, o próprio consegue selecionar o tipo de utilizador que é e,
após introduzir o username e a password que lhes foram atribuídos, clica no botão ”Autenticar”
e acede à janela da sua respetiva área.

![image](https://user-images.githubusercontent.com/61700999/207397223-729f64ea-f721-4827-bec3-462d2710e216.png)

Se o utilizador autenticado, for um administrador, acede à Área de Administrador como
na figura 4. Ao clicar em “Utilizador”, o administrador consegue criar utilizadores e remover
utilizadores caso o pretenda fazer. Se clicar em “Tipos de Resíduos”, o administrador consegue
criar, alterar e listar os tipos de Resíduos existentes.
Caso pretenda sair da aplicação, clica em “Sair”, ou se quiser voltar ao login clica no
botão “Voltar”.

![image](https://user-images.githubusercontent.com/61700999/207397310-7d2445ca-e343-468c-80a9-9d3fb337d083.png)

Se o administrador, clicar em “Criar Utilizador”, acede à janela que mostra na figura 5.
Após a inserção dos dados do utilizador que pretende criar, o administrador clica no botão “Criar”,
caso pretenda voltar à sua área de administrador clica no botão “Voltar”.

![image](https://user-images.githubusercontent.com/61700999/207397790-c0985995-eeb9-4097-a0e2-0611fd686d1f.png)

Se o administrador clicar em “Criar Tipos de Resíduos”, acede à janela
representada na figura 6. Após a inserção dos dados, o administrador, clica em “Criar”, e
volta à janela anterior.

![image](https://user-images.githubusercontent.com/61700999/207397878-8e05092a-d6de-4681-a236-d8b876aa4a25.png)

Caso o utilizador seja um “Gestor”, terá de fazer o login com as duas credenciais e após
a sua autenticação, irá aceder à sua “Área de Gestor”, tal como na figura 7. Nesta janela, ele
poderá sair clicando no botão “Sair”, saindo da aplicação e poderá voltar à janela anterior,
clicando no botão” Voltar”. 

No menu desta janela, o gestor ao clicar em “Ordens de Serviço”, este poderá criar Ordens
de Serviço, se clicar em “Contentores” poderá criar contentores (“Criar Contentor”) ou listar os
contentores existentes se clicar em “Listar Contentor”. Por último, ainda no menu, se clicar em
“Parques de Contentores”, o gestor poderá listar parques que gere se clicar em “Listar Parques”.

![image](https://user-images.githubusercontent.com/61700999/207397967-18382b86-03cd-4f81-b04c-0e372df85bef.png)

Se o Gestor clicar em “Criar Ordens de Serviço”, este será direcionado para a janela “Criar
Ordens de Serviço”, como na figura 8. Após a inserção dos dados, clica em “Criar”, e a ordem
fica criada. O Gestor volta para a sua área de gestor.

![image](https://user-images.githubusercontent.com/61700999/207398041-a8a4a8f8-8595-466f-b30c-edf7669ca62e.png)

Se o Gestor pretender criar um contentor novo, clica em “Contentores” no menu e de
seguida clica em “Criar Contentor”, sendo direcionado para a janela “Criar Contentor”, como se
ilustra na figura 9. Após a inserção dos dados, clica no botão “Criar”.

![image](https://user-images.githubusercontent.com/61700999/207398120-286af569-f6f9-484f-9dfe-7956a79e076d.png)

Caso o utilizador seja um “Município”, após a sua autenticação, será direcionado para a
sua “Área de Município”. 

![image](https://user-images.githubusercontent.com/61700999/207398219-31c2d1f8-d86c-4852-91f2-dba966345788.png)

Este tem um menu disponível , que se clicar em “Parques de Contentores” poderá criar
um Parque (em “Criar Parque”), podendo também listá-los e alterá-los. Se clicar em
Trabalhadores, o Município poderá criar (“Criar Trabalhador”), remover (“Remover
Trabalhador”), listar (“Listar trabalhador”) e alterar os mesmos (“Alterar Trabalhador”).
Caso o Município, queira criar um parque de contentores, aparecerá uma janela como a
figura seguinte.

![image](https://user-images.githubusercontent.com/61700999/207398284-b93ac4eb-d5b0-44bc-a60e-af2146d1d4d3.png)

Caso o utilizador seja uma Equipa, após a sua autenticação, será direcionada para a janela
“Área de Equipa”. Como ilustra a seguinte figura.

![image](https://user-images.githubusercontent.com/61700999/207398387-8b19bb4c-67fd-46a9-b5ab-5a619f402fdd.png)

Esta área tem disponível um menu em que se clicar em “Ordens de Serviço”, consegue
listar as ordens de serviço (“Listar Ordens de Serviço”) e se clicar em “Parques de Contentores”,
consegue pesquisá-los.  
Se clicar no botão “Sair”, o utilizador sai da aplicação e se clicar em “Voltar”, volta à
janela anterior que neste caso é a janela de “Login de Utilizador”.

## Conclusão

Conclui-se que, apesar de todas as dificuldades e de a aplicação não estar no seu perfeito
funcionamento, foi possível a aprendizagem tanto no funcionamento do programa NetBeans
como da parte de desenvolvimento do código em si. Este trabalho ajudou no melhoramento da
compreensão de toda a matéria elaborada ao longo deste semestre, na disciplina de Programação
II.  

Houve algumas dificuldades na aplicação da linguagem Java para a criação de todas as
funções e também na criação das interfaces gráficas uma vez que não dominava esses campos.
Contudo, todo este trabalho deu para perceber melhor todas estas partes e ainda no
desenvolvimento de uma aplicação capaz de ser útil no dia-a-dia.  









