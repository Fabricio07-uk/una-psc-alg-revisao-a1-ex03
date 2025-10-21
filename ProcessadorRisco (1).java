import java.util.Arrays;

public class ProcessadorRisco {

    public static void main(String[] args) {

        int[] notasRisco = {
            88, 75, 92, 60, 81,
            45, 55, 30, 68, 72, 15, 20, 95, 50, 48
        };

        double somaPonderada = 0;
        int somaPesos = 0;
        

        for (int i = 0; i < notasRisco.length; i++) {
            if (i < 5) {
                somaPonderada += notasRisco[i] * 3;
                somaPesos += 3;
            } else {
                somaPonderada += notasRisco[i] * 1;
                somaPesos += 1;
            }
        }

        double mediaPonderada = somaPonderada / somaPesos;

        int contagemOtimistas = 0;
        int contagemAlarmantes = 0;

        for (int nota : notasRisco) {

            if (nota <= 20) {
                contagemOtimistas++;
            }
            if (nota >= 90) {
                contagemAlarmantes++;
            }
        }

        String parecerFinal;

        if (mediaPonderada > 70) {
            parecerFinal = "Alto Risco: Venda ou reajuste de portfólio recomendado.";
        } else if (mediaPonderada >= 40) {
            parecerFinal = "Risco Moderado: Acompanhar de perto, mas manter os ativos.";
        } else { 
            parecerFinal = "Baixo Risco: Excelente momento para capitalização.";
        }

        System.out.println("--- Análise de Risco do Setor ---");
        System.out.println("Notas de Risco Coletadas: " + Arrays.toString(notasRisco));
        System.out.println("------------------------------------");

        System.out.printf("Média Ponderada de Risco: %.2f\n", mediaPonderada);
        System.out.println("------------------------------------");

        System.out.println("Número de Analistas Otimistas (nota <= 20): " + contagemOtimistas);
        System.out.println("Número de Analistas Alarmantes (nota >= 90): " + contagemAlarmantes);
        System.out.println("------------------------------------");
        
        System.out.println("Parecer Final: " + parecerFinal);
        System.out.println("------------------------------------");
    }
}