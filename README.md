# Gerenciador_De_Estoque

</br></br>

O Fast Stocks é um software de gestão microempresarial amplo e moderno que oferece a função de controle de estoque com cadastro de clientes e fornecedores. Ele está sendo desenvolvido por <a href="https://github.com/GrendaCarla">Grenda Silva</a> e <a href="https://github.com/Leckaa">Quézia Godoy</a> em Java durante a aula de Prática profissional: Projeto e desenvolvimento de Software da graduação de ADS na <a href="https://www.usf.edu.br/">Universidade São Francisco</a>.


* Java
* SQL Server


</br>
<h2>Tópicos</h2>

* ### <a href="#Instrucoes">Instruções de Uso</a>
     * <a href="#Cmain">Alteração na classe Main</a>
     * <a href="#CconnectionFactory">Alteração na classe ConnectionFactory</a>
     * <a href="#CtelaCadastroBanco">Alteração na classe TelaCadastroBanco</a>
     * <a href="#IconnectionFactory">Inserção na classe ConnectionFactory</a>

* ### <a href="#prints">Prints da Interface</a>
     * <a href="#banco">Conectando com o Banco de Dados</a>
     * <a href="#fornecedores">Fornecedores</a>
     * <a href="#compras">Compras</a>
     * <a href="#produtos">Estoque de Produtos</a>
     * <a href="#vendas">Vendas</a>
     * <a href="#clientes">Clientes</a>

* ### <a href="#classes">Diagrama de Classes</a>

* ### <a href="#casoDeUso">Diagrama de Caso de Uso</a>



</br>
<div id="Instrucoes"><h1>Instruções de Uso</h1></div>
</br>


<p>Não foi possível a criação de um método de leitura de arquivo com os dados de conexão com o banco que funcione em um executável .jar, por causa disso existe 2 formas de funcionamento do software:</p>
</br>

<p>1  -	Através do Netbeans IDE executar os arquivos do programa;</p>

<p>2  -	Alterar o código colocando as informações de acesso ao banco direto nas variáveis, gerar o banco SQL Server manualmente através do arquivo SQL.sql na pasta inicial e comentar determinadas linhas de código para execução direta do software.</p>

</br>

### Forma 2  -	Comente os seguintes trechos de código:

<div id="Cmain"><h3 align="center">Classe Main</h3></div>
</br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121233114-ac6e5d00-c868-11eb-8a9d-18bbe4ee348b.PNG"></p>
</br></br>


<div id="CconnectionFactory"><h3 align="center">Classe ConnectionFactory</h3></div>
</br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121233358-f6efd980-c868-11eb-9d91-f0cbfe0a1cc7.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121233439-1129b780-c869-11eb-901a-481dcb0f099f.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121233696-43d3b000-c869-11eb-8143-e45a3b2726b2.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121233812-6a91e680-c869-11eb-885b-f5f3c2a13ec6.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121233940-8dbc9600-c869-11eb-9bed-98d521de6f14.PNG"></p>
</br></br>


<div id="CtelaCadastroBanco"><h3 align="center">Classe TelaCadastroBanco</h3></div>
</br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121233997-9f05a280-c869-11eb-8a51-aeebbeade980.PNG"></p>
</br></br>


### Forma 2  -	Insira os Valores de acesso ao banco SQL Server no seguinte trecho do código:

<div id="IconnectionFactory"><h3 align="center">Classe ConnectionFactory</h3></div>
</br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121234586-3e2a9a00-c86a-11eb-9abb-a97eeaf802ac.PNG"></p>
</br></br>











</br>
<div id="prints"><h1>Prints da Interface</h1></div>
</br>


<div id="banco"><h3 align="center">Conectando com o Banco de Dados</h3></div>


<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121213873-049b6400-c855-11eb-8388-e67e22fee32a.PNG"></p>
</br></br>


<div id="fornecedores"><h3 align="center">Fornecedores</h3></div>


<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121211209-aff6e980-c852-11eb-9daa-e9d77dd94d8a.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121211456-de74c480-c852-11eb-8fcb-2595b134968f.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121211611-0106dd80-c853-11eb-81ec-2b8aec1095e7.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121211790-2693e700-c853-11eb-98c7-7790ea08e20f.PNG"></p>
</br></br>


<div id="compras"><h3 align="center">Compras</h3></div>


<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121213058-4b3c8e80-c854-11eb-9f50-f558d5595cf4.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121213239-71622e80-c854-11eb-8c85-39a3c916ab2e.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121213271-78893c80-c854-11eb-8335-54ff79440d66.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121213388-8c34a300-c854-11eb-82e4-1757c29839d1.PNG"></p>
</br></br>



<div id="produtos"><h3 align="center">Estoque de Produtos</h3></div>


<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121214056-2b599a80-c855-11eb-9f5a-9c5797c8deba.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121214233-46c4a580-c855-11eb-896a-6e54f5f0e22e.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121214162-3e6c6a80-c855-11eb-8d0f-c1fdd343de79.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121214268-517f3a80-c855-11eb-9ae3-1d15454a9332.PNG"></p>
</br></br>


<div id="vendas"><h3 align="center">Vendas</h3></div>


<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121215257-3cef7200-c856-11eb-82d0-8ad91c74582d.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121222552-049f6200-c85d-11eb-9c50-88ad14eefbc8.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121222580-0bc67000-c85d-11eb-9b3e-723ce31da695.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121222614-154fd800-c85d-11eb-8a92-fa4938b58fb9.PNG"></p>
</br></br>


<div id="clientes"><h3 align="center">Clientes</h3></div>


<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121222285-cace5b80-c85c-11eb-916a-6e1abc325a2b.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121223213-ad4dc180-c85d-11eb-97bf-e578b64a5528.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121223236-b474cf80-c85d-11eb-950e-b39a3b441ca6.PNG"></p>
</br></br>

<p width="30%"><img align=center src="https://user-images.githubusercontent.com/80162033/121223305-c3f41880-c85d-11eb-9701-1bb55a73f4d6.PNG"></p>
</br></br>






</br></br></br>
<div id="classes"><h1>Diagrama de Classes</h1></div>
</br>

<p width="70%"><img align=center src="https://user-images.githubusercontent.com/80162033/119914327-43b4e580-bf36-11eb-8cd1-767d70c99e50.png"></p>
</br></br>



</br>
<div id="casoDeUso"><h1>Diagrama de Caso de Uso</h1></div>
</br>

<p width="70%"><img align=center src="https://user-images.githubusercontent.com/80162033/119914098-e3be3f00-bf35-11eb-8634-945f121fe69d.png"></p>
</br></br>

