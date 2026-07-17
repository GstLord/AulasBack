import model.Carro;

void main() {
    Scanner sc = new Scanner(System.in);

    double valorTotal = 0;
    int qtd = 0;
    do {
        System.out.println("Quantos carros deseja cadastrar(Max:50?: ");
        qtd = sc.nextInt();
    } while (qtd > 50);

    Carro vetorCar[] = new Carro[qtd];

    for(int i = 0; i < qtd; i++){

        System.out.println("Qual o nome do carro: ");
        String nome = sc.next();
        System.out.println("Qual a cor do carro: ");
        String cor = sc.next();
        System.out.println("Qual o valor do carro: ");
        double valor = sc.nextDouble();
        System.out.println("Qual o ano do carro: ");
        String ano = sc.next();
        Carro carroAtual;

        carroAtual = new Carro(nome, cor, valor, ano);

        vetorCar[i] = carroAtual;

        valorTotal = valorTotal + valor;
    }
    System.out.println("Carros informados: ");

    for(int i = 0; i < qtd; i++){
        System.out.println(vetorCar[i].pegaNome());
    }
    System.out.println("Quantidade de carros: " + qtd);
    System.out.println("Valor total dos carros apresentados: " + valorTotal);

}




