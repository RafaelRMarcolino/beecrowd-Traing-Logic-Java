package POO.escola;

public class Aluno {

    private String nome;
    private String matricula;
    public String[] disciplina = new String[3];
    public int[][] notas = new int[3][4];

    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas das disciplina " + disciplina[i]);
            for (int j = 0; j < notas[i].length; j++) {

                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }//for

    }//mostrarInfo


     boolean verificarAprovado(int indice) {

        double soma = 0;

        for (int i = 0; i < notas[indice].length; i++) {
            soma += notas[indice][i];
        }

        double media = soma / 4;

        if (media >= 7) {
            return true;
        } else {

            return false;
        }

    }
    }




