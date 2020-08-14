## Strategy

O Stra­tegy é um pa­drão de pro­jeto com­por­ta­men­tal que per­mite que você de­fina uma fa­mí­lia de al­go­rit­mos, co­lo­que-os em clas­ses se­pa­ra­das, e faça os ob­je­tos deles in­ter­cam­biá­veis.

### Ana­lo­gia com o mundo real

 ![](/strategy/sort-algorithms-strategy/image/image1.png) 

Ima­gine que você tem que che­gar ao ae­ro­porto. Você pode pegar um ôni­bus, pedir um táxi, ou subir em sua bi­ci­cleta. Essas são suas es­tra­té­gias de trans­porte. Você pode es­co­lher uma das es­tra­té­gias de­pen­dendo de fa­to­res como or­ça­mento

### Es­tru­tura

 ![](/strategy/sort-algorithms-strategy/image/image2.png) 
 
1. O Con­texto man­tém uma re­fe­rên­cia para uma das es­tra­té­gias con­cre­tas e se co­mu­nica com esse ob­jeto atra­vés da in­ter­face da estratégia . 

2. A in­ter­face Es­tra­té­gia é comum à todas as es­tra­té­gias con­cre­tas. Ela de­clara um mé­todo que o con­texto usa para exe­cu­tar uma estratégia .

3. Es­tra­té­gias Con­cre­tas im­ple­men­tam di­fe­ren­tes va­ri­a­ções de um al­go­ritmo que o con­texto usa . 

4. O con­texto chama o mé­todo de exe­cu­ção no ob­jeto es­tra­té­gia li­gado cada vez que ele pre­cisa rodar um al­go­ritmo. O con­texto não sabe qual tipo de es­tra­té­gia ele está tra­ba­lhando ou como o al­go­ritmo é executado . 

5. O Cli­ente cria um ob­jeto es­tra­té­gia es­pe­cí­fico e passa ele para o con­texto. O con­texto expõe um set­ter que per­mite o cli­ente mudar a es­tra­té­gia as­so­ci­ada
