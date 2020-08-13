## Bridge 

O Bridge é um pa­drão de pro­jeto es­tru­tu­ral que per­mite que você di­vida uma classe grande ou um con­junto de clas­ses in­ti­ma­mente li­ga­das em duas hi­e­rar­quias se­pa­ra­das—abs­tra­ção e im­ple­men­ta­ção—que podem ser de­sen­vol­vi­das in­de­pen­den­te­mente umas das outras .

### Problema

Di­ga­mos que você tem uma classe `Forma` ge­o­mé­trica com um par de sub­clas­ses: `Círculo` e `Quadrado` . Você quer es­ten­der essa hi­e­rar­quia de classe para in­cor­po­rar cores, então você pla­neja criar as sub­clas­ses de forma `Vermelho` e `Azul` . Con­tudo, já que você já tem duas sub­clas­ses, você pre­cisa criar qua­tro com­bi­na­ções de classe tais como `CírculoAzul` e `QuadradoVermelho`.

Adi­ci­o­nar novos tipos de forma e cores à hi­e­rar­quia irá fazê-la cres­cer ex­po­nen­ci­al­mente. Por exem­plo, para adi­ci­o­nar uma forma de tri­ân­gulo você vai pre­ci­sar in­tro­du­zir duas sub­clas­ses, uma para cada cor. E de­pois disso, adi­ci­o­nando uma nova cor será ne­ces­sá­rio três sub­clas­ses, uma para cada tipo de forma. Quanto mais longe vamos, pior isso fica .

 ![](/image/image1.png) 


### Solução

Esse pro­blema ocorre por­que es­ta­mos ten­tando es­ten­der as clas­ses de forma em duas di­men­sões di­fe­ren­tes: por forma e por cor. Isso é um pro­blema muito comum com he­rança de classe . O pa­drão Bridge tenta re­sol­ver esse pro­blema ao tro­car de he­rança para com­po­si­ção do ob­jeto. Isso sig­ni­fica que você ex­trai uma das di­men­sões em uma hi­e­rar­quia de classe se­pa­rada, para que as clas­ses ori­gi­nais re­fe­ren­ciem um ob­jeto da nova hi­e­rar­quia, ao invés de ter todos os seus es­ta­dos e com­por­ta­men­tos

 ![](/image/image2.png) 
 
 Se­guindo essa abor­da­gem nós po­de­mos ex­trair o có­digo re­la­ci­o­nado à cor em sua pró­pria classe com duas sub­clas­ses: Vermelho e Azul . A classe Forma então ganha um campo de re­fe­rên­cia apon­tando para um dos ob­je­tos de cor. Agora a forma pode de­le­gar qual­quer tra­ba­lho re­fe­rente a cor para o ob­jeto li­gado a cor. Aquela re­fe­rên­cia vai agir como uma ponte entre as clas­ses Forma e Cor . De agora em di­ante, para adi­ci­o­nar novas cores não será ne­ces­sá­rio mudar a hi­e­rar­quia da forma e vice versa .
 
