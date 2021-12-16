Feature: Realizar cadastro sample app


  Scenario: Realizar cadastro de veiculo
    Given que eu esteja na home do site do advantage shopping
    # ABA ENTER VEHICLE DATA
    When seleciono a marca "BMW"
    And seleciono o modelo "Three-Wheeler"
    And preencho o campo capacidade de cilindro "1000"
    And preencho o campo performance do motor "100"
    And preencho a data de fabricacao "10/05/2010"
    And seleciono o numero de acentos "2"
    And preencho a lista de preços "1000"
    And preencho a quilometragem anual "200"
    And clico no botao 'Next'
    # ABA ENTER INSURANT DATA
    And preencho o campo primeiro nome "ronald"
    And preencho o campo ultimo nome "pereira"
    And preencho o campo data de nascimento "12/03/1992"
    And seleciono o genero sexual "masculino"
    And preencho o campo endereco "Rua Boston"
    And seleciono o país "Brazil"
    And preencho o campo cep "05870060"
    And preencho o campo cidade "São Paulo"
    And seleciono a ocupação "Public Official"
    And seleciono o hobbie 'Skydiving'
    And preencho o campo websites "www.desafiotecnico.com.br"
    And clico no botao 'Next'
    # ABA ENTER PRODUCT DATA
    And preencho o campo data inicio "12/08/2022"
    And seleciono a soma do seguro "5000000"
    And seleciono o seguro de danos "No Coverage"
    And selecino o produto opcional 'Euro Protection'
    And clico no botao 'Next'
    # ABA SELECT PRICE OPTION
    And seleciono a opcao 'Silver'
    And clico no botao 'Next'
    # ABA SEND QUOTE
    And preencho o campo email "ronald@gmail.com"
    And preencho o campo telefone "11999999999"
    And preencho o campo usuario "ronaldpereira"
    And preencho o campo senha "Ronald123"
    And preencho o campo confirma senha "Ronald123"
    And preencho o campo de comentario "desafio tecnico, realizar cadastro!"
    And clico no botao 'Send'
    Then valido email enviado com sucesso