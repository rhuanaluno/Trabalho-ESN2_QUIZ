public class Principal {
    public static void main(String[] args){

        
        int acertos = 0;
        int erros = 0;

        Questao[] questoes = new Questao[15];

        // =================================
        // NIVEL FACIL - QUESTOES 1 A 5
        // =================================

        questoes[0] = new Questao();
        questoes[0].pergunta = "1) Qual marca fabrica o modelo Corolla?";
        questoes[0].opcaoA = "A) Honda";
        questoes[0].opcaoB = "B) Toyota";
        questoes[0].opcaoC = "C) Nissan";
        questoes[0].opcaoD = "D) Hyundai";
        questoes[0].opcaoE = "E) Volkswagen";
        questoes[0].correta = "B";

        questoes[1] = new Questao();
        questoes[1].pergunta = "2) Qual combustivel e utilizado em carros a diesel?";
        questoes[1].opcaoA = "A) Etanol";
        questoes[1].opcaoB = "B) Gasolina";
        questoes[1].opcaoC = "C) Diesel";
        questoes[1].opcaoD = "D) GNV";
        questoes[1].opcaoE = "E) Querosene";
        questoes[1].correta = "C";

        questoes[2] = new Questao();
        questoes[2].pergunta = "3) Qual marca tem como simbolo quatro argolas entrelacadas?";
        questoes[2].opcaoA = "A) BMW";
        questoes[2].opcaoB = "B) Mercedes-Benz";
        questoes[2].opcaoC = "C) Audi";
        questoes[2].opcaoD = "D) Porsche";
        questoes[2].opcaoE = "E) Ferrari";
        questoes[2].correta = "C";

        questoes[3] = new Questao();
        questoes[3].pergunta = "4) Qual e a funcao principal do volante?";
        questoes[3].opcaoA = "A) Aumentar a velocidade";
        questoes[3].opcaoB = "B) Controlar a direcao";
        questoes[3].opcaoC = "C) Frear o veiculo";
        questoes[3].opcaoD = "D) Ligar o motor";
        questoes[3].opcaoE = "E) Controlar o combustivel";
        questoes[3].correta = "B";

        questoes[4] = new Questao();
        questoes[4].pergunta = "5) Qual piloto brasileiro foi tricampeao mundial de Formula 1?";
        questoes[4].opcaoA = "A) Rubens Barrichello";
        questoes[4].opcaoB = "B) Felipe Massa";
        questoes[4].opcaoC = "C) Nelson Piquet";
        questoes[4].opcaoD = "D) Ayrton Senna";
        questoes[4].opcaoE = "E) Emerson Fittipaldi";
        questoes[4].correta = "D";


        // =================================
        // NIVEL MEDIO - QUESTOES 6 A 10
        // =================================

        questoes[5] = new Questao();
        questoes[5].pergunta = "6) Qual fabricante produz o Mustang?";
        questoes[5].opcaoA = "A) Chevrolet";
        questoes[5].opcaoB = "B) Dodge";
        questoes[5].opcaoC = "C) Ford";
        questoes[5].opcaoD = "D) Cadillac";
        questoes[5].opcaoE = "E) Chrysler";
        questoes[5].correta = "C";

        questoes[6] = new Questao();
        questoes[6].pergunta = "7) O que significa a sigla ABS nos freios de um carro?";
        questoes[6].opcaoA = "A) Sistema de bloqueio automatico";
        questoes[6].opcaoB = "B) Sistema antitravamento dos freios";
        questoes[6].opcaoC = "C) Sistema de aceleracao basica";
        questoes[6].opcaoD = "D) Assistente de balanceamento";
        questoes[6].opcaoE = "E) Controle automatico de suspensao";
        questoes[6].correta = "B";

        questoes[7] = new Questao();
        questoes[7].pergunta = "8) Qual destes modelos e um carro esportivo da Porsche?";
        questoes[7].opcaoA = "A) Civic";
        questoes[7].opcaoB = "B) Corolla";
        questoes[7].opcaoC = "C) 911";
        questoes[7].opcaoD = "D) Onix";
        questoes[7].opcaoE = "E) Jetta";
        questoes[7].correta = "C";

        questoes[8] = new Questao();
        questoes[8].pergunta = "9) Qual e a funcao do radiador no sistema de arrefecimento?";
        questoes[8].opcaoA = "A) Resfriar o liquido de arrefecimento";
        questoes[8].opcaoB = "B) Lubrificar o motor";
        questoes[8].opcaoC = "C) Filtrar o combustivel";
        questoes[8].opcaoD = "D) Aumentar a pressao dos pneus";
        questoes[8].opcaoE = "E) Carregar a bateria";
        questoes[8].correta = "A";

        questoes[9] = new Questao();
        questoes[9].pergunta = "10) Qual marca fabrica o modelo Lancer Evolution?";
        questoes[9].opcaoA = "A) Subaru";
        questoes[9].opcaoB = "B) Mitsubishi";
        questoes[9].opcaoC = "C) Mazda";
        questoes[9].opcaoD = "D) Suzuki";
        questoes[9].opcaoE = "E) Toyota";
        questoes[9].correta = "B";


        // =================================
        // NIVEL DIFICIL - QUESTOES 11 A 15
        // =================================

        questoes[10] = new Questao();
        questoes[10].pergunta = "11) O que significa a sigla DOHC em um motor?";
        questoes[10].opcaoA = "A) Duplo comando de valvulas no cabecote";
        questoes[10].opcaoB = "B) Sistema de injecao direta";
        questoes[10].opcaoC = "C) Controle eletronico de combustivel";
        questoes[10].opcaoD = "D) Sistema de refrigeracao dupla";
        questoes[10].opcaoE = "E) Dupla saida de escapamento";
        questoes[10].correta = "A";

        questoes[11] = new Questao();
        questoes[11].pergunta = "12) Qual e a funcao principal do diferencial em um automovel?";
        questoes[11].opcaoA = "A) Aumentar a potencia do motor";
        questoes[11].opcaoB = "B) Permitir velocidades diferentes entre as rodas motrizes";
        questoes[11].opcaoC = "C) Controlar a temperatura do motor";
        questoes[11].opcaoD = "D) Regular a pressao dos pneus";
        questoes[11].opcaoE = "E) Diminuir o consumo de oleo";
        questoes[11].correta = "B";

        questoes[12] = new Questao();
        questoes[12].pergunta = "13) Em um motor turboalimentado, qual componente comprime o ar admitido?";
        questoes[12].opcaoA = "A) Alternador";
        questoes[12].opcaoB = "B) Radiador";
        questoes[12].opcaoC = "C) Turbocompressor";
        questoes[12].opcaoD = "D) Virabrequim";
        questoes[12].opcaoE = "E) Catalisador";
        questoes[12].correta = "C";

        questoes[13] = new Questao();
        questoes[13].pergunta = "14) Qual e a funcao do sensor MAF em um motor?";
        questoes[13].opcaoA = "A) Medir a massa de ar admitida pelo motor";
        questoes[13].opcaoB = "B) Medir a pressao dos pneus";
        questoes[13].opcaoC = "C) Controlar a temperatura do oleo";
        questoes[13].opcaoD = "D) Medir a velocidade das rodas";
        questoes[13].opcaoE = "E) Controlar a tensao da bateria";
        questoes[13].correta = "A";

        questoes[14] = new Questao();
        questoes[14].pergunta = "15) Qual componente transforma o movimento alternativo dos pistoes em movimento rotativo?";
        questoes[14].opcaoA = "A) Comando de valvulas";
        questoes[14].opcaoB = "B) Biela";
        questoes[14].opcaoC = "C) Virabrequim";
        questoes[14].opcaoD = "D) Cabecote";
        questoes[14].opcaoE = "E) Volante do motor";
        questoes[14].correta = "C";


        // =================================
        // EXECUCAO DO QUIZ
        // =================================

        System.out.println("================================");
        System.out.println("         QUIZ SOBRE CARROS");
        System.out.println("================================");

        for (int i = 0; i < questoes.length; i++) {

            if (i == 0) {
                System.out.println("\n===== NIVEL FACIL =====\n");

            } else if (i == 5) {
                System.out.println("\n===== NIVEL MEDIO =====\n");

            } else if (i == 10) {
                System.out.println("\n===== NIVEL DIFICIL =====\n");
            }

            System.out.println("Pergunta " + (i + 1) + " de 15");

            questoes[i].escrevaQuestao();

            String resposta = questoes[i].leiaResposta();

            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            } else {
                erros++;
            }
        }


        // =================================
        // RESULTADO FINAL
        // =================================

        System.out.println("\n================================");
        System.out.println("           FIM DO QUIZ!");
        System.out.println("================================");

        System.out.println("Total de perguntas: 15");
        System.out.println("Respostas corretas: " + acertos);
        System.out.println("Respostas erradas: " + erros);

        double porcentagem = (acertos * 100.0) / 15;

        System.out.printf("\nVoce acertou %.1f%% das perguntas!%n",
                porcentagem);

        System.out.println("\n===== SUA CLASSIFICACAO =====");

        if (acertos <= 5) {

            System.out.println("Voce precisa estudar mais sobre carros!");

        } else if (acertos <= 10) {

            System.out.println("Muito bem! Voce entende um pouco de carros!");

        } else {

            System.out.println("PARABENS! VOCE E UM GRANDE ENTENDEDOR DE CARROS!");

        }

        System.out.println("\n================================");
        System.out.println("        OBRIGADO POR JOGAR!");
        System.out.println("================================");

    }
}
    
