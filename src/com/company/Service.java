package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    public class Main {
        static List<Cliente> clienteList = new ArrayList<>();

        int remover = 0;

        public static void main(String[] args) {
            Cliente cliente = new Cliente();
            Produto produtinhos = new Produto();

            int contador = 0;
            Lol:
            while (true) {
                contador++;
                System.out.println("Você deseja continuar ou sair do looping? ");
                System.out.println("Se você deseja sair digite: (1)");
                System.out.println("Se você deseja criar uma entidade cliente digite: (2)");
                Scanner scanner = new Scanner(System.in);
                int opcaoEscolhida = scanner.nextInt();

                if (opcaoEscolhida == 1) {
                    for (Cliente x : clienteList) {
                        System.out.println("Lista definitiva de Clientes: ");
                        System.out.println("Nome: " + x.nome);
                        System.out.println("Total da Compra: " + x.totalCompra);

                    }
                    break Lol;
                }

                if (opcaoEscolhida == 2) {
                    System.out.println("-------------------------------------------------------");

                    Scanner scannerNumeros = new Scanner(System.in);
                    System.out.println("Digite quantos clientes deseja adicionar.");
                    int quantidadeCli = scannerNumeros.nextInt();
                    for (int i = 0; i < quantidadeCli; i++) {
                        Scanner scannerPalavras = new Scanner(System.in);

                        System.out.println("Digite o nome do cliente");
                        String nomeC = scannerPalavras.nextLine();
                        cliente.nome = nomeC;

                        System.out.println("Digite o CPF do cliente");
                        String cpfC = scannerPalavras.nextLine();
                        cliente.CPF = cpfC;

                        System.out.println("LISTA DE PRODUTOS:");
                        System.out.println("[1]Chiclete(0.10$); [2]Chocolate(5.00$); [3]Pirulito(0.60$)");
                        System.out.println("FIQUE A VONTADE PARA ESCOLHER :");
                        System.out.println("*************************************");


                        UAL:
                        while (true) {
                            System.out.println("Digite o ID do produto que deseja comprar");
                            int idProdu = scannerNumeros.nextInt();
                            produtinhos.ID = idProdu;
                            if (produtinhos.ID == 1) {
                                produtinhos.nomeP = "Chiclete";
                                produtinhos.PrecoIndividual = 0.10;

                                System.out.println("Digite a quantidade  que deseja comprar");
                                int quantidadePro = scannerNumeros.nextInt();
                                produtinhos.quantidade = quantidadePro;
                                produtinhos.Precototal = produtinhos.PrecoIndividual * produtinhos.quantidade;

                            } else if (produtinhos.ID == 2) {
                                produtinhos.nomeP = "Chocolate";
                                produtinhos.PrecoIndividual = 5.00;

                                System.out.println("Digite a quantidade  que deseja comprar");
                                int quantidadePro = scannerNumeros.nextInt();
                                produtinhos.quantidade = quantidadePro;
                                produtinhos.Precototal = produtinhos.PrecoIndividual * produtinhos.quantidade;

                            } else {
                                produtinhos.nomeP = "Pirulito";
                                produtinhos.PrecoIndividual = 0.60;

                                System.out.println("Digite a quantidade  que deseja comprar");
                                int quantidadePro = scannerNumeros.nextInt();
                                produtinhos.quantidade = quantidadePro;
                                produtinhos.Precototal = produtinhos.PrecoIndividual * produtinhos.quantidade;

                            }
                            System.out.println("Você deseja adicionar mais algum produto? [1]Sim [2]Não");
                            int escolha = scannerPalavras.nextInt();
                            if (escolha == 2) {
                                break UAL;
                            }
                        }
                        clienteList.add(cliente);
                        System.out.println("-------------------------------------------------------");

                    }
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você deseja remover algum cliente? (1)Remover um Cliente | (2)Adicionar cliente| (3)atualizar clientes ou produtos | (4) Ver todos os clientes da lista | (5) Remover um produto do cliente");
                    Scanner scanner1 = new Scanner(System.in);
                    int remover = scanner1.nextInt();
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    if (remover == 1) {
                        Scanner remove = new Scanner(System.in);
                        System.out.println("Digite o CPF do cliente que você deseja remover:");
                        Integer removerCliente = remove.nextInt();
                        for (int i = 0; i < clienteList.size(); i++) {
                            if (removerCliente.equals(clienteList.get(i).CPF)) {
                                clienteList.remove(i);
                                System.out.println("-------------------------------------------------------");
                                System.out.println("Você deseja começar o processo de novo? (1)Sim (2)Não");
                                int recomecar = remove.nextInt();
                                if (recomecar == 1) {
                                    continue Lol;
                                } else
                                    break Lol;


                            }
                        }
                    } else if (remover == 2) {
                        System.out.println("\n");

                        System.out.println("Digite quantos clientes deseja adicionar.");
                        int quantidadeClie = scannerNumeros.nextInt();
                        for (int i = 0; i < quantidadeClie; i++) {
                            Scanner scannerPalavras = new Scanner(System.in);

                            System.out.println("Digite o nome do cliente");
                            String nomeC = scannerPalavras.nextLine();
                            cliente.nome = nomeC;

                            System.out.println("Digite o CPF do cliente");
                            String cpfC = scannerPalavras.nextLine();
                            cliente.CPF = cpfC;

                            System.out.println("LISTA DE PRODUTOS:");
                            System.out.println("[1]Chiclete(0.10$); [2]Chocolate(5.00$); [3]Pirulito(0.60$)");
                            System.out.println("FIQUE A VONTADE PARA ESCOLHER :");
                            System.out.println("*************************************");


                            POW:
                            while (true) {
                                System.out.println("Digite o ID do produto que deseja comprar");
                                int idProdu = scannerNumeros.nextInt();
                                produtinhos.ID = idProdu;
                                if (produtinhos.ID == 1) {
                                    produtinhos.nomeP = "Chiclete";
                                    produtinhos.PrecoIndividual = 0.10;

                                    System.out.println("Digite a quantidade  que deseja comprar");
                                    int quantidadePro = scannerNumeros.nextInt();
                                    produtinhos.quantidade = quantidadePro;
                                    produtinhos.Precototal = produtinhos.PrecoIndividual * produtinhos.quantidade;

                                } else if (produtinhos.ID == 2) {
                                    produtinhos.nomeP = "Chocolate";
                                    produtinhos.PrecoIndividual = 5.00;

                                    System.out.println("Digite a quantidade  que deseja comprar");
                                    int quantidadePro = scannerNumeros.nextInt();
                                    produtinhos.quantidade = quantidadePro;
                                    produtinhos.Precototal = produtinhos.PrecoIndividual * produtinhos.quantidade;

                                } else {
                                    produtinhos.nomeP = "Pirulito";
                                    produtinhos.PrecoIndividual = 0.60;

                                    System.out.println("Digite a quantidade  que deseja comprar");
                                    int quantidadePro = scannerNumeros.nextInt();
                                    produtinhos.quantidade = quantidadePro;
                                    produtinhos.Precototal = produtinhos.PrecoIndividual * produtinhos.quantidade;

                                }
                                System.out.println("Você deseja adicionar mais algum produto? [1]Sim [2]Não");
                                int escolha = scannerPalavras.nextInt();
                                if (escolha == 2) {
                                    break POW;
                                }
                            }
                            clienteList.add(cliente);
                            System.out.println("-------------------------------------------------------");


                        } if (remover == 3) {
                            System.out.println("Digite o CPF do cliente que você atualizar: ");
                            Scanner acharCliente = new Scanner(System.in);
                            for (int a = 0; a < clienteList.size(); a++) {
                                if (acharCliente.equals(clienteList.get(a).CPF)) {
                                    int clienteAchar = acharCliente.nextInt();
                                    System.out.println("Você deseja atualizar: [1]a quantidade do produtos [2]o nome do cliente");
                                    int escolha = scanner.nextInt();
                                    if (escolha == 1) {
                                        System.out.println("Digite a nova quantidade de produtos");
                                        int novaQuantidade = scannerNumeros.nextInt();
                                        novaQuantidade = produtinhos.quantidade;
                                    } else {
                                        System.out.println("Digite o novo nome do cliente");
                                        String novoNome = scanner.nextLine();
                                        novoNome = cliente.nome;
                                    }
                                }
                            }
                        }

//

                    }
                } 
                else if (remover == 4) {
                    System.out.println("\n");
                    System.out.println("Digite o CPF do cliente que você deseja localizar: ");
                    Scanner acharCliente = new Scanner(System.in);
                    System.out.println("=========================");
                    for (int f =0;f<clienteList.size();f++) {
                        if(acharCliente.equals(clienteList.get(f).CPF)){}
                        System.out.println("Nome: " + cliente.nome);
                        System.out.println("CPF " + cliente.CPF);
                        System.out.println("Total da compra: " + cliente.totalCompra);
                        System.out.println("=========================");
                    }
                } else if (remover == 5) {
                    System.out.println("Digite o CPF do cliente que você deseja localizar: ");
                    Scanner acharCliente = new Scanner(System.in);
                    Integer achaCliente = acharCliente.nextInt();
                    for (int a = 0; a < clienteList.size(); a++) {
                        if (acharCliente.equals(clienteList.get(a).CPF)){
                            System.out.println("Digite o produto que deseja remover");
                             String remocao = scanner.nextLine();
                              if(remocao.equals(produtinhos.nomeP)){

                              }
                        }

                    }

                }
            }
            for(Produto c: cliente.produtos){
                cliente.totalCompra+=c.Precototal;
            }
            for(Cliente c:clienteList){
                System.out.println("=========================");
                System.out.println("Nome: " + cliente.nome);
                System.out.println("CPF " + cliente.CPF);
                if(cliente.totalCompra > 100){
                    double desconto = (cliente.totalCompra * 10) / 100;
                    cliente.totalCompra = desconto;
                }else{
                    double acrescimo = (cliente.totalCompra * 1) / 100;
                    cliente.totalCompra = acrescimo + cliente.totalCompra;
                }
                System.out.println("Total da compra: " + cliente.totalCompra);
                System.out.println("=========================");
            }



        }
    }
}
