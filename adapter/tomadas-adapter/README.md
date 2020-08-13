# Adapter 
(Adaptador, ou também conhecido como Wrapper) é um dos padrões de projeto estruturais do GoF (Gang of Four).

De forma exemplificável por um adaptadores de cabos, o padrão Adapter converte a interface de uma classe para outra interface que o cliente espera encontrar, "traduzindo" solicitações do formato requerido pelo usuário para o formato compatível com o a classe adaptee e as redirecionando. Dessa forma, o Adaptador permite que classes com interfaces incompatíveis trabalhem juntas.

 ![](/adapter_pattern.png) 


### Descrição das classes de acordo com o diagrama UML

Target (Alvo): define a interface do domínio específico que o cliente utiliza.

Adapter (Adaptador): adapta a interface Adaptee para a interface da classe Target.

Adaptee (Adaptada): define uma interface existente que necessita ser adaptada.

Client (Cliente): colabora com os objetos em conformidade com a interface Target.


### Motivação

Muitas vezes uma classe que poderia ser reaproveitada não é reutilizada justamente pelo fato de sua interface não corresponder à interface específica de um domínio requerida por uma aplicação.


### Analogia com o mundo real

Quando você viaja do Brasil para a EUA pela primeira vez, você pode ter uma pequena surpresa quando tenta carregar seu laptop. O plugue e os padrões de tomadas são diferentes em diferentes países. É por isso que seu plugue do Brasil não vai caber em uma tomada dos EUA. O problema pode ser resolvido usando um adaptador de tomada que tenha o estilo de tomada Brasileira e o plugue no estilo Americano.


 ![](/exemplo.png) 
 
 
 ## Prós e con­tras 
 
 #### Prin­cí­pio de res­pon­sa­bi­li­dade única. 
 Você pode se­pa­rar a con­ver­são de in­ter­face ou de dados da ló­gica pri­má­ria do ne­gó­cio do programa . 
 
 #### Prin­cí­pio aberto/fe­chado. 
 Você pode in­tro­du­zir novos tipos de adap­ta­do­res no pro­grama sem que­brar o có­digo cli­ente exis­tente, desde que eles tra­ba­lhem com os adap­ta­do­res atra­vés da in­ter­face cliente . 
 
 #### Com­ple­xi­dade
 A com­ple­xi­dade geral do có­digo au­menta por­que você pre­cisa in­tro­du­zir um con­junto de novas in­ter­fa­ces e clas­ses. Al­gu­mas vezes é mais sim­ples mudar a classe ser­viço para que ela se ade­que com o resto do seu código .