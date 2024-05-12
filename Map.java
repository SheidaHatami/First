package map;

public class Map {

    public static void main(String[] args) {
        Country romania = new Country("Romania");

        City arad = new City("Arad");
        City zerind = new City("Zerind");
        City oradea = new City("Oradea");
        City sibiu = new City("Sibiu");
        City timisoara = new City("Timisoara");
        City lugoj = new City("Lugoj");
        City mehadia = new City("Mehadia");
        City dobreta = new City("Dobreta");
        City craiova = new City("Craiova");
        City rimnicuVilcea = new City("Rimnicu Vilcea");
        City pitesti = new City("Pitesti");
        City fagaras = new City("Fagaras");
        City bucharest = new City("Bucharest");
        City giurgiu = new City("Giurgiu");
        City urziceni = new City("Urziceni");
        City hirsova = new City("Hirsova");
        City eforia = new City("Eforia");
        City vaslui = new City("Vaslui");
        City iasi = new City("Iasi");
        City neamt = new City("Neamt");

        romania.add_city(arad);
        romania.add_city(zerind);
        romania.add_city(oradea);
        romania.add_city(sibiu);
        romania.add_city(timisoara);
        romania.add_city(lugoj);
        romania.add_city(mehadia);
        romania.add_city(dobreta);
        romania.add_city(craiova);
        romania.add_city(rimnicuVilcea);
        romania.add_city(pitesti);
        romania.add_city(fagaras);
        romania.add_city(bucharest);
        romania.add_city(giurgiu);
        romania.add_city(urziceni);
        romania.add_city(hirsova);
        romania.add_city(eforia);
        romania.add_city(vaslui);
        romania.add_city(iasi);
        romania.add_city(neamt);

        arad.add_neighbor(zerind, 75).add_neighbor(sibiu, 140).add_neighbor(timisoara, 118);
        zerind.add_neighbor(arad, 75).add_neighbor(oradea, 71);
        oradea.add_neighbor(zerind, 71).add_neighbor(sibiu, 151);
        sibiu.add_neighbor(oradea, 151).add_neighbor(arad, 140).add_neighbor(rimnicuVilcea, 80).add_neighbor(fagaras, 99);
        timisoara.add_neighbor(lugoj, 111).add_neighbor(arad, 118);
        lugoj.add_neighbor(timisoara, 111).add_neighbor(mehadia, 70);
        mehadia.add_neighbor(lugoj, 70).add_neighbor(dobreta, 75);
        dobreta.add_neighbor(craiova, 120).add_neighbor(mehadia, 75);
        craiova.add_neighbor(dobreta, 120).add_neighbor(rimnicuVilcea, 146).add_neighbor(pitesti, 138);
        rimnicuVilcea.add_neighbor(craiova, 97).add_neighbor(pitesti, 138).add_neighbor(bucharest, 101);
        pitesti.add_neighbor(rimnicuVilcea, 97).add_neighbor(craiova, 138).add_neighbor(sibiu, 80);
        fagaras.add_neighbor(sibiu, 99).add_neighbor(bucharest, 211);
        bucharest.add_neighbor(fagaras, 211).add_neighbor(pitesti, 101).add_neighbor(giurgiu, 90).add_neighbor(urziceni, 85);
        giurgiu.add_neighbor(bucharest, 90);
        urziceni.add_neighbor(bucharest, 85).add_neighbor(hirsova, 98).add_neighbor(vaslui, 142);
        hirsova.add_neighbor(urziceni, 86);
        eforia.add_neighbor(urziceni, 98);
        vaslui.add_neighbor(hirsova, 86);
        neamt.add_neighbor(vaslui, 142);


        dijkstraAlgorithm dijkstra = new dijkstraAlgorithm(arad, bucharest);
        dijkstra.execute();

        System.out.println("Shortest path from Arad to Bucharest:");
        dijkstra.printPath();
        System.out.println("Total weight: " + dijkstra.totalWeight());
    }
}
