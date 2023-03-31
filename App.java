public class App {
    public static void main(String[] args) {

        Data d1 = new Data(9, 11, 1997);
        Endereco end = new Endereco("RUA", 18454, "KSOJDO", "cijasdije", "ksodkoe");
        Telefone tel = new Telefone(15, 8989865);
        Cliente cli = new Cliente("Joao", 56845, 98765412, 81965458, 1125699, "Ruas SKODKek");

        System.out.println("Nome: " + cli.Nome);
        System.out.println("CPF: " + cli.Cpf);
        System.out.println("NUMERO: " + cli.Telefone);
        System.out.println("DATA: " + d1.Dia + "/" + d1.Mes + "/" + d1.Ano);
        System.out.println("ESTADO: " + end.Estado);
        System.out.println("TEL: " + tel.DDD);

    }
}