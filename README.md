<h2 align="center">
<img src="https://lh3.googleusercontent.com/Ie3tjxX8E51qHUEFuboJcBe7tBvhGqHwsAhJ859yMTa6OmpDbMpc7jwKG_Ek7pPZTUkIvpIoX0NpjDF8sFwNoe8Sux2ulC4BiC-5CBpkouwxGhBfk-EPg9GgPK8S01FXswRahVhwNlqlbK7zypqlszijiMxpPxSyh2cdpuT3esTFxm_zD4X7559M1DrAzZm95LOx2-WoDEzpOodOnuKkczQNZ07l0vV29Kl9D4uPesFpdkivNpt8_0oT4GPpBH0UyLzARX5fJqsH5P923hJaIejzClqaeVRT9AcOLBxE4ChZ6PaFRy0CpP-LijoBBt_njo75CNw3n_WCz7I1W67xF3Fm9ss5-YqdxNKT-w8sfwld8e9e4PsQa9ukgqEIBjGZCPp-BSkNtEMHixCjVrgcPCSlkBLwNDtwhs1qfVNGl0mk8xseWQr3ZsoHttklfuvD7l5hIKyVavcDB-T5fMvO0SD3-6L6cxZADt9hmNWT-IAwsDFA8cjcRra1Bl1UN91yKK6vXmcbJshUC4zBNv9U1znmxg4-7M_W-wOdMKqN6p1BnbpEAIDubedccQ=w1326-h644" width="30%">
</h2>

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

<img src="https://lh3.googleusercontent.com/24z1mZBJAN6s4J6rWxZ2e7-s5E7PTXkY0u5-zFy0uV0c4le5ftI8n-CkoTsLD1vgBMBrXJt3dTwSY2IK8QY38_5pJMK1f_9juRunv1ma5ZNQteU4uMqQEmVl2rglYEoJy3-yk3gwWsbh7XEHUY27XrT7dmcV7laxpAflyPT3DhOUjyaUP1mqKhhAkqE9HGD1N9ROQSI44iMfxz8mus0LxiIawvAhNFmo1wEdvM7IyAnAQgRC1gaeddLte0qrRrFm3MfetvwxkR7xq8blaFCPPAi23vNvh-FjD1mJPRqo0XJK0fVBUhbzEe1k4-ZH7plkEAHayHjkNYqfxdiXFT77zqc1lmb8eghqbkHXpix28dpq-U3hwL5vsmLYOlkYR9YMFJWjEb287ZQ3LJkBi2MXFKkMsqIGUra_Q5tFqz4E6f27-rHdHTh664jXs0q6aor6LRe9091fjdivKO95KFydoAo_Rq6EmzeCHpiRZtQVbnl2M_pLHr7Wa2ADFbH2CylT80TKp6ippoxY0BJrojHC0Nyrcw3UMjMiBHRgJF8dnArDwWwN57q62eAB3g=w1326-h644">

<img src="https://lh3.googleusercontent.com/vQzrjg4_-tkiJaAgMbZrReW17WuJes8Ndygv7ULBisu6CEXfT6okbSZjNmxBU3eTQh2R2nc0RqN0gtV4YNf7UbFliCmMhCYQNmq0JcTWpA6wk12xW0vvzBUUA1TQkUmbNsAIa2AWtLlm84zl74R38WJ0YM_GI3voVrESBoprFQBRXFFGMQtpOJXZKZOeuEo33arde2y5NXuyo4EJOmdtxVOAJV_ZEbabEm9-0SoIl4MqS229YIg35t6hKZ-Wod51WwqKotlseuw236QMQYWKbFs4uBz0SE62bQCLXgR1Khg9iPeVcc8yBu4y1rx_3LsHd5XSmoSJefBTUpTmOMDRCgO-A1j12K3WZaMo5To97vhN5H2Tq_mi6BnKSP0vjlz8CvIvalykwsJKYeMHSQ1iaB0eYh7ueG6xJEid3OXFa2o6MIA8tu8550lQpPegh64X3zobsvM82dOecA4PTnUyDiz_FhzMZsOmrSYGGrlNuPul8VvNwoA_Eno8y3im74dfJxsyVCtVEvt5CXfPg2TdjvyiporLGAcE-L0iud-q8JagKhLipaiqwoNu8w=w1326-h644">

<img src="https://lh3.googleusercontent.com/LgUD6VxtodNXgUOgMaMqCaSKRT59niy35HpKl7jYZEbfr-42mAZenurbu6J2uSDrMTF278qjBSk3c1LFPlK4QUSFs90ckUlbBoV_vSf02ozX00tDpRDcvbeO3ry1xc7tHp9opPsto8OXOhp0WsgN9f1ionRJVET311yyFdDft1or7zq4ygoUuYebRTyDGb7RVezC2OfPLMfJ7xmxyJSK4I57uA5TQ33NSpc7hdoJsXImFocwpLDIoBy0eC8Ra4McO67cQNv7iadNHJP_NQIlUgcqI1ye_2jSE4zmVivKaNWrVZBbN_X4MRcyBqKsqn9ej8cZKRU3xETTBVax36rMnvZNbkO1c0Q6d_Hv8uWySVAy1l1c-8GGlYjJR1Yo4Kx0C-5UZjuNA2NZAmMe6OhxwFg5ZJ-wtYd1E-00qiyWcouTFaJ3rrEa6dp9tADrsg6pmQIAhQxruLXoONOe-JW1EeeFmp2yGQGu7w5C2rQPSzAn7fffl5dQv5w-YRSdCxwwUonP423Np3p5OE2uEos36CSka3nJulq8UkL3vEyrmsEvdhu0WabAT7g52g=w1326-h644">

<img src="https://lh3.googleusercontent.com/ddNHsI7hPU9yUgYwHlhI8QeYCAWh23JVwzcdN8O3cOyu_R6RMpmfybF7SHVRR3LKdgYmbPnXtxfrWgkB1scO65XSHk80BO3XE647aQoq9SNufhSebCyXK3lSn6delBHP_eWtO6isHoSMglSfwqYgWxaevBQZIBgTL8DbH5kGjHWPYH68y1aLdmNTpiYgcp0Vi4F1dD9yS4_EYb-NscZGyL6GOvLrbVlTtm-Ar4O9o2-UoIYYNiRKVh8lsIo5rMwKqnkWSO_25EGuJiZS-27_hjzVDQpP5yLadyamrWIr39K7TFT0q11pqOnoQ0fVsyM6E4G-2sJlvfM69k_yfBnAjNjx7siXfW-380mncR6ZoRSTgAlShgynOeki1B4CNJSVTZfG8AaNypYhg1sUXuOLK7zn0FC_9BsLHkBB8aJS_xnKlThKOosS1dJkiB-7sGU3LLHeEwBFqyEdBCgxQwBrQlaSo4YN9bOuBKv1PpeVP4PJoZx5A8kAKJq4ztU2acJQZD6ov9pV3LWjSBowrRjTaRDn_6v4hBNgwpeFzjfZZsiYRXuhxUtGfk6n6A=w1326-h644" width="35%">
	
## Controllers


## Models


## Public


