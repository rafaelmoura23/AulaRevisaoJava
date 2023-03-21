package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);
    
    public void exemplo1() {
        System.out.println("Informe a 1ª Nota do Aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a 2ª Nota do Aluno:");
        int nota2 = sc.nextInt();
        double media = (nota1+nota2)/2;
        System.out.println("A média do aluno é: " +media);
        System.out.println("Informe o Total de Aulas da Disciplina: ");
        int aulas = sc.nextInt();
        System.out.println("Informe o Total de Faltas do Aluno: ");
        int faltas = sc.nextInt();
        double frequencia = ((aulas-faltas)*100)/aulas;
        System.out.println("A frequência do Aluno é: " +frequencia +"%");
        if(media>=50 && frequencia>=75) {
            System.out.println("O Aluno está Aprovado");
        } else if (media<50 && frequencia>=75){
            System.out.println("O Aluno está de Recuperação");
        }
        else{
            System.out.println("O Aluno está Reprovado");
        }
        
    }
}