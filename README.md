<h2 align="center">
<img src="https://lh3.googleusercontent.com/Ie3tjxX8E51qHUEFuboJcBe7tBvhGqHwsAhJ859yMTa6OmpDbMpc7jwKG_Ek7pPZTUkIvpIoX0NpjDF8sFwNoe8Sux2ulC4BiC-5CBpkouwxGhBfk-EPg9GgPK8S01FXswRahVhwNlqlbK7zypqlszijiMxpPxSyh2cdpuT3esTFxm_zD4X7559M1DrAzZm95LOx2-WoDEzpOodOnuKkczQNZ07l0vV29Kl9D4uPesFpdkivNpt8_0oT4GPpBH0UyLzARX5fJqsH5P923hJaIejzClqaeVRT9AcOLBxE4ChZ6PaFRy0CpP-LijoBBt_njo75CNw3n_WCz7I1W67xF3Fm9ss5-YqdxNKT-w8sfwld8e9e4PsQa9ukgqEIBjGZCPp-BSkNtEMHixCjVrgcPCSlkBLwNDtwhs1qfVNGl0mk8xseWQr3ZsoHttklfuvD7l5hIKyVavcDB-T5fMvO0SD3-6L6cxZADt9hmNWT-IAwsDFA8cjcRra1Bl1UN91yKK6vXmcbJshUC4zBNv9U1znmxg4-7M_W-wOdMKqN6p1BnbpEAIDubedccQ=w1326-h644" width="30%">
</h2>

<p align="center">
Professor: Danilo Abreu<br>
Laboratório de Programação<br>
Leonardo Araujo Silva<br>
<br>
Link da apresentação do projeto: <a href="https://www.youtube.com/watch?v=EB6ec485ZLY" target="_blank">clique aqui</a>
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

<img src="https://lh3.googleusercontent.com/9TPxBYkPJyIxvBl86GsSexWsfjkKmNUJt-cXD6zZWVrhSGz2tVKSIQ0ENu4QGC2ITaDegYyVjNscC27bnWbAFn38_Ho5WBqVAEwWlGyE2C-QZ72yNFpgrvIrdRsY-FLQA1ZRjgEOzduan6aYRV94VpJtiaiwmngBWyo19ifDIEJv8ShgA1N806xKrlI91s8SPvbFmrKU75BS__Aim-J15wVfscok45JFxt5dlFCKuDSOdWO7AGDxnDzv-A5aAhdjQcz-skfr_qv6YbNKJd1FSMB44v90EjnFMm9BsE9e5hGX-GvxvLZ02uVSWIaOuSJi-bvXlI6cOeWUnRrMWGKtlq7Hg9hGJkIu2BE7nuaCLthPeV-iwysG1O4S4TZs12LxW8_lNleMAh6Y36-c4FBp4nqL8xsYsyz4LGLV8untDqLKzrwL0GorFNsF7XBQHspuQSOvnCIIio97XqqE3bjRCPfafUngcNHgHPeTCYZqCDngUWdD5UQ99g3wI30_MndCqaHfyg5TF-krG-OCH6w4_FT_hhOa6WhkbU6ZBWKgT4ynntCEG5QE32XylQ=w1325-h644" style="margin-top: -22px;">

<img src="https://lh3.googleusercontent.com/hvlvEQAl9ECqPKggqcjXfRzqBmbAacQ9OZAmD53ANOpTLccQS22Z1UZsite0pgeFzgApJL7VuPeWFx4G_1l9D-BE666rMdsFravufgNbimYJA9sdvaaj6pGhil8LSU1MCJqe7uCvCUpSZD685nnLTsX_pV3rfRFgikgjzpkIgZRRG_pOPpEy7As-BVD9EC1txjwBu03uIQh37pZF8kLv44d6WAA9PaxMnF50lP2CKOYnUnaiaexs0R414rEFZjJqQhJ2M6w3QbSMdXpqcPYILDvWEbeaYZU49J1-rcW18JI2_620S1R93VlUqVRY2AuyeDdtnQA0Fb062WpaYrYrmOYWpczNHJw_JrkDihrv5NEkjBZVGfnQb3uSPAyZjymlSu-X0cUZxT6YQjj79J3xc1J_kmb-pdJfwQiXX3iIADh3e2jSApui3Au_AD1uPLjcGkVJlB2TOz9uulxLVNM4AiOrfAlVIPDv7Wriq5oJhHYVpg08YrIVpLdbyOxFgdl8M36zH9N_kDmwK7fODERQBxL6-2wfmVVzzzJgOhx0zv6ft_RbU6qDw7TZLw=w1325-h644">

<img src="https://lh3.googleusercontent.com/HwZ86KGvtA2YyL6-G3AEv2jqc-KKBHrEJaVlTPo4_AxLloPebBPqeNzIl1vvbpHz0hxW7pTptcAFUpr4GsJzVvlJ-MG_AWZqtRTTNc0RVh3aI9_4nRiAZ9MSa4CWIrBPhzmzuPzs6u_SNcZejdaQJNvY72K5pjFIsZkRIjOcZ6jrGPya7bhek6fTSoota_1cZFgwoqv4RtvF44CpFrDwxa5TAgv_vu0g85f6o7TWghbHRdPEYUVqlHqvK5NjY4IDCzbnUnK8CTYZcOJWMA2aVRefIdNDj6Dru9oy7S-o01lSdZe9lY-_lOUyx5MEoIbJPJnXuPOar5v74I6DKQnpRHTVCEdGpyzaYe6fDCCDmeCCYJyBrxXJhPruxGgEusX5pu-Db5SxTkO1Wlm6dPupKuqIYClOEc7O6C02nQdl-9wuY-yPLQUCGz7VhUmDVPsyhn85je5Hy7Q1QwqugWtPf0bdIeuWdg8M2i4CF_X8YJgPHvIpJTNsSyaWI2Yneb5YoVUBqmxrDenge1WFgK2qgh69VaA0vf73TS2F7ZDszPvQ-oMt8fhqI3JGWg=w1325-h644" style="margin-top: -25px; margin-left: 3px;">

