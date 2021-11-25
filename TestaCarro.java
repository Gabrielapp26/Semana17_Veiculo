public class TestaCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println("O carro da "+carro.getNome());
        System.out.println("É um "+carro.getModelo());
        System.out.println("Fabricante: "+carro.getFabricante());
        System.out.println("E o seu ID é: "+carro.getId());
    }
    
}
