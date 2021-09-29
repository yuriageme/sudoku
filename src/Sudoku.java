public class Sudoku {

        // Definição de uma matriz simples para jogo. A matriz é um Array 2D.

        public static int[][] matrizJogo = {
                {9,0,0,1,0,0,0,0,5},
                {0,0,5,0,9,0,2,0,1},
                {8,0,0,0,4,0,0,0,0},
                {0,0,0,0,8,0,0,0,0},
                {0,0,0,7,0,0,0,0,0},
                {0,0,0,0,2,6,0,0,9},
                {2,0,0,3,0,0,0,0,6},
                {0,0,0,2,0,0,9,0,0},
                {0,0,1,9,0,4,5,7,0},
        };

        public static int[][] matrizFacil = {
                {0,7,5,1,8,2,6,0,0},
                {8,0,0,0,6,0,0,5,7},
                {4,0,3,7,9,5,8,0,0},
                {5,0,4,6,0,7,0,9,8},
                {7,8,0,0,2,1,0,0,5},
                {6,3,2,8,5,0,1,7,4},
                {0,9,6,0,4,3,7,0,2},
                {0,4,0,9,1,8,0,0,6},
                {3,5,0,2,0,0,4,0,9},
        };
	
	        public  static  int [] [] matrizFacil2 = {
                { 2 , 8 , 6 , 1 , 9 , 0 , 0 , 4 , 7 },
                { 3 , 0 , 0 , 0 , 2 , 0 , 1 , 5 , 6 },
                { 5 , 4 , 1 , 0 , 0 , 0 , 8 , 9 , 2 },
                { 1 , 9 , 0 , 6 , 0 , 0 , 0 , 8 , 0 },
                { 6 , 3 , 0 , 8 , 0 , 0 , 5 , 7 , 9 },
                { 8 , 5 , 0 , 3 , 7 , 9 , 4 , 0 , 0 },
                { 7 , 0 , 5 , 0 , 0 , 0 , 6 , 0 , 4 },
                { 0 , 0 , 3 , 0 , 4 , 6 , 7 , 2 , 0 },
                { 0 , 6 , 8 , 2 , 3 , 7 , 9 , 1 , 0 },
        };

        public  static  int [] [] matrizFacil3 = {
                { 8 , 0 , 0 , 0 , 0 , 5 , 0 , 0 , 0 },
                { 0 , 7 , 0 , 9 , 0 , 0 , 0 , 4 , 0 },
                { 0 , 0 , 9 , 0 , 7 , 8 , 3 , 2 , 5 },
                { 3 , 0 , 1 , 0 , 9 , 0 , 0 , 5 , 0 },
                { 0 , 0 , 6 , 0 , 0 , 0 , 1 , 0 , 0 },
                { 0 , 9 , 0 , 0 , 3 , 0 , 6 , 0 , 2 },
                { 2 , 8 , 3 , 6 , 5 , 0 , 7 , 0 , 0 },
                { 0 , 1 , 0 , 0 , 0 , 2 , 0 , 8 , 0 },
                { 0 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 9 },
        };

        public  static  int [] [] matrizFacil4 = {
                { 5 , 1 , 4 , 0 , 7 , 0 , 8 , 0 , 0 },
                { 0 , 3 , 0 , 2 , 0 , 0 , 0 , 9 , 7 },
                { 0 , 0 , 7 , 8 , 0 , 0 , 0 , 1 , 0 },
                { 0 , 0 , 3 , 0 , 6 , 0 , 2 , 0 , 5 },
                { 0 , 5 , 0 , 3 , 0 , 7 , 0 , 8 , 0 },
                { 7 , 0 , 2 , 0 , 9 , 0 , 3 , 0 , 0 },
                { 0 , 8 , 0 , 0 , 0 , 2 , 4 , 0 , 0 },
                { 3 , 4 , 0 , 0 , 0 , 5 , 0 , 2 , 0 },
                { 0 , 0 , 6 , 0 , 8 , 0 , 1 , 5 , 3 },
        };

        public  static  int [] [] matrizFacil5 = {
                { 1 , 0 , 0 , 7 , 0 , 6 , 0 , 0 , 0 },
                { 6 , 0 , 5 , 0 , 9 , 4 , 0 , 0 , 2 },
                { 0 , 7 , 0 , 0 , 0 , 0 , 0 , 8 , 0 },
                { 9 , 0 , 0 , 4 , 0 , 0 , 0 , 7 , 1 },
                { 0 , 5 , 0 , 9 , 7 , 2 , 0 , 3 , 0 },
                { 8 , 2 , 0 , 0 , 0 , 1 , 0 , 0 , 5 },
                { 0 , 1 , 0 , 0 , 0 , 0 , 0 , 9 , 0 },
                { 7 , 0 , 0 , 5 , 4 , 0 , 1 , 0 , 3 },
                { 0 , 0 , 0 , 6 , 0 , 9 , 5 , 0 , 7 },        
        };

        public  static  int [] [] matrizFacil6 = {
                { 0 , 0 , 0 , 0 , 0 , 7 , 5 , 0 , 0 },
                { 7 , 0 , 0 , 1 , 0 , 0 , 0 , 4 , 0 },
                { 5 , 0 , 0 , 0 , 0 , 0 , 2 , 0 , 0 },
                { 0 , 0 , 1 , 3 , 9 , 0 , 0 , 0 , 8 },
                { 3 , 0 , 0 , 7 , 8 , 6 , 0 , 0 , 4 },
                { 8 , 0 , 0 , 0 , 4 , 1 , 7 , 0 , 0 },
                { 0 , 0 , 8 , 0 , 0 , 0 , 0 , 0 , 9 },
                { 0 , 5 , 0 , 0 , 0 , 3 , 0 , 0 , 1 },
                { 0 , 0 , 4 , 6 , 0 , 0 , 0 , 0 , 0 },        
        };

        public  static  int [] [] matrizFacil7 = {
                { 0 , 0 , 0 , 0 , 0 , 6 , 3 , 0 , 0 },
                { 5 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 6 },
                { 0 , 0 , 6 , 8 , 0 , 3 , 0 , 9 , 5 },
                { 7 , 0 , 1 , 0 , 0 , 0 , 4 , 0 , 8 },
                { 6 , 0 , 0 , 4 , 1 , 8 , 0 , 0 , 2 },
                { 8 , 0 , 3 , 0 , 0 , 0 , 6 , 0 , 9 },
                { 1 , 6 , 0 , 5 , 0 , 2 , 8 , 0 , 0 },
                { 3 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 },
                { 0 , 0 , 4 , 6 , 0 , 0 , 0 , 0 , 0 },       
        };

        public  static  int [] [] matrizFacil8 = {
                { 8 , 0 , 0 , 7 , 1 , 5 , 0 , 0 , 4 },
                { 0 , 0 , 5 , 3 , 0 , 6 , 7 , 0 , 0 },
                { 3 , 0 , 6 , 4 , 0 , 8 , 9 , 0 , 1 },
                { 0 , 6 , 0 , 0 , 5 , 0 , 0 , 4 , 0 },
                { 0 , 0 , 0 , 8 , 0 , 7 , 0 , 0 , 0 },
                { 0 , 5 , 0 , 0 , 4 , 0 , 0 , 9 , 0 },
                { 6 , 0 , 9 , 5 , 0 , 3 , 4 , 0 , 2 },
                { 0 , 0 , 4 , 9 , 0 , 2 , 5 , 0 , 0 },
                { 5 , 0 , 0 , 1 , 6 , 4 , 0 , 0 , 9 },       
        };

        public  static  int [] [] matrizFacil9 = {
                { 5 , 0 , 0 , 0 , 8 , 6 , 0 , 0 , 1 },
                { 0 , 0 , 2 , 7 , 0 , 1 , 6 , 0 , 0 },
                { 0 , 7 , 1 , 0 , 0 , 0 , 2 , 5 , 0 },
                { 9 , 1 , 0 , 0 , 2 , 0 , 0 , 7 , 0 },
                { 3 , 0 , 0 , 1 , 4 , 5 , 0 , 0 , 6 },
                { 0 , 6 , 0 , 0 , 9 , 0 , 0 , 2 , 4 },
                { 0 , 5 , 3 , 0 , 0 , 0 , 4 , 6 , 0 },
                { 0 , 0 , 8 , 9 , 0 , 3 , 5 , 0 , 0 },
                { 2 , 0 , 0 , 5 , 1 , 0 , 0 , 0 , 7 },       
        };

        public  static  int [] [] matrizFacil10 = {
                { 0 , 8 , 0 , 0 , 0 , 0 , 2 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 8 , 4 , 0 , 9 , 0 },
                { 0 , 0 , 6 , 3 , 2 , 0 , 0 , 1 , 0 },
                { 0 , 9 , 7 , 0 , 0 , 0 , 0 , 8 , 0 },
                { 8 , 0 , 0 , 9 , 0 , 3 , 0 , 0 , 2 },
                { 0 , 1 , 0 , 0 , 0 , 0 , 9 , 5 , 0 },
                { 0 , 7 , 0 , 0 , 4 , 5 , 8 , 0 , 0 },
                { 0 , 3 , 0 , 7 , 1 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 8 , 0 , 0 , 0 , 0 , 4 , 0 },      
        };

        public  static  int [] [] matrizFacil11 = {
                { 0 , 0 , 0 , 4 , 3 , 5 , 0 , 0 , 0 },
                { 5 , 0 , 6 , 1 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 2 , 0 , 0 , 0 , 0 , 0 , 5 , 0 },
                { 0 , 0 , 0 , 0 , 7 , 0 , 0 , 2 , 9 },
                { 0 , 7 , 0 , 6 , 0 , 9 , 1 , 0 , 0 },
                { 9 , 4 , 0 , 0 , 8 , 0 , 0 , 0 , 0 },
                { 0 , 1 , 0 , 0 , 0 , 0 , 0 , 9 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 6 , 7 , 0 , 3 },
                { 0 , 0 , 0 , 8 , 5 , 4 , 0 , 0 , 0 },      
        };

        public  static  int [] [] matrizFacil12 = {
                { 5 , 0 , 0 , 6 , 9 , 0 , 8 , 4 , 2 },
                { 6 , 0 , 0 , 3 , 7 , 8 , 0 , 0 , 0 },
                { 8 , 0 , 0 , 4 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 4 , 0 , 0 , 0 , 0 , 3 , 2 , 6 },
                { 3 , 1 , 0 , 0 , 0 , 0 , 0 , 8 , 5 },
                { 2 , 5 , 8 , 0 , 0 , 0 , 0 , 7 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 4 , 0 , 0 , 9 },
                { 0 , 0 , 0 , 7 , 2 , 6 , 0 , 0 , 8 },
                { 4 , 6 , 5 , 0 , 3 , 9 , 0 , 0 , 7 },      
        };

        public  static  int [] [] matrizFacil13 = {
                { 1 , 7 , 9 , 5 , 0 , 0 , 0 , 0 , 8 },
                { 0 , 6 , 0 , 0 , 3 , 8 , 0 , 1 , 5 },
                { 0 , 0 , 5 , 0 , 0 , 0 , 9 , 0 , 6 },
                { 0 , 3 , 0 , 1 , 0 , 9 , 0 , 0 , 7 },
                { 0 , 2 , 0 , 0 , 0 , 0 , 0 , 9 , 0 },
                { 9 , 0 , 0 , 7 , 0 , 2 , 0 , 8 , 0 },
                { 4 , 0 , 2 , 0 , 0 , 0 , 8 , 0 , 0 },
                { 8 , 1 , 0 , 2 , 5 , 0 , 0 , 3 , 0 },
                { 7 , 0 , 0 , 0 , 0 , 4 , 6 , 5 , 2 },     
        };

        public  static  int [] [] matrizFacil14 = {
                { 6 , 4 , 9 , 3 , 0 , 0 , 2 , 0 , 7 },
                { 0 , 0 , 1 , 0 , 4 , 2 , 0 , 0 , 9 },
                { 3 , 0 , 0 , 0 , 0 , 0 , 0 , 8 , 1 },
                { 0 , 8 , 0 , 0 , 6 , 0 , 0 , 0 , 5 },
                { 0 , 3 , 0 , 2 , 0 , 9 , 0 , 4 , 0 },
                { 9 , 0 , 0 , 0 , 3 , 0 , 0 , 2 , 0 },
                { 5 , 2 , 0 , 0 , 0 , 0 , 0 , 0 , 3 },
                { 1 , 0 , 0 , 5 , 2 , 0 , 8 , 0 , 0 },
                { 4 , 0 , 3 , 0 , 0 , 8 , 5 , 1 , 2 },    
        };

        public  static  int [] [] matrizFacil15 = {
                { 4 , 0 , 2 , 5 , 0 , 3 , 0 , 0 , 1 },
                { 0 , 5 , 7 , 0 , 9 , 0 , 0 , 4 , 0 },
                { 0 , 0 , 0 , 4 , 0 , 1 , 0 , 2 , 5 },
                { 7 , 0 , 6 , 0 , 0 , 0 , 1 , 0 , 2 },
                { 0 , 4 , 0 , 0 , 0 , 0 , 0 , 3 , 0 },
                { 5 , 0 , 9 , 0 , 0 , 0 , 6 , 0 , 4 },
                { 2 , 9 , 0 , 1 , 0 , 7 , 0 , 0 , 0 },
                { 0 , 7 , 0 , 0 , 4 , 0 , 2 , 1 , 0 },
                { 3 , 0 , 0 , 2 , 0 , 5 , 4 , 0 , 7 },   
        };

        public  static  int [] [] matrizFacil16 = {
                { 0 , 6 , 5 , 3 , 8 , 0 , 4 , 1 , 7 },
                { 0 , 0 , 1 , 4 , 7 , 0 , 0 , 0 , 0 },
                { 2 , 0 , 0 , 0 , 0 , 0 , 0 , 9 , 0 },
                { 0 , 0 , 6 , 1 , 0 , 0 , 0 , 7 , 0 },
                { 5 , 0 , 0 , 2 , 0 , 3 , 0 , 0 , 1 },
                { 0 , 3 , 0 , 0 , 0 , 8 , 9 , 0 , 0 },
                { 0 , 5 , 0 , 0 , 0 , 0 , 0 , 0 , 9 },
                { 0 , 0 , 0 , 0 , 3 , 7 , 1 , 0 , 0 },
                { 7 , 1 , 8 , 0 , 5 , 4 , 2 , 3 , 0 },  
        };

        public  static  int [] [] matrizFacil17 = {
                { 1 , 0 , 0 , 0 , 0 , 8 , 0 , 0 , 5 },
                { 0 , 0 , 5 , 0 , 4 , 2 , 8 , 0 , 0 },
                { 0 , 8 , 2 , 7 , 9 , 0 , 6 , 4 , 0 },
                { 5 , 2 , 0 , 0 , 0 , 0 , 7 , 0 , 0 },
                { 0 , 3 , 1 , 0 , 0 , 0 , 9 , 2 , 0 },
                { 0 , 0 , 8 , 0 , 0 , 0 , 0 , 5 , 6 },
                { 0 , 1 , 6 , 0 , 7 , 4 , 5 , 3 , 0 },
                { 0 , 0 , 3 , 9 , 2 , 0 , 4 , 0 , 0 },
                { 2 , 0 , 0 , 3 , 0 , 0 , 0 , 0 , 9 }, 
        };

        public static int[][] matrizMedio = {
                {0,7,2,0,0,0,9,0,8},
                {9,0,0,0,0,0,5,2,0},
                {0,0,0,0,9,0,0,7,1},
                {2,9,1,5,0,7,8,4,0},
                {3,5,4,9,8,2,0,0,0},
                {0,0,8,3,0,0,0,0,0},
                {6,0,0,0,4,0,3,0,0},
                {0,0,0,8,0,5,0,6,0},
                {0,0,3,6,2,0,4,0,7},
        };
	
	        public static int[][] matrizMedio2 = {
                { 7 , 6 , 0 , 0 , 0 , 0 , 0 , 0 , 5 },
                { 0 , 0 , 1 , 0 , 6 , 2 , 8 , 4 , 0 },
                { 3 , 0 , 8 , 5 , 0 , 0 , 0 , 0 , 9 },
                { 1 , 0 , 0 , 2 , 0 , 0 , 9 , 7 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 7 , 9 , 0 , 0 , 8 , 0 , 0 , 1 },
                { 4 , 0 , 0 , 0 , 0 , 6 , 5 , 0 , 2 },
                { 0 , 2 , 3 , 7 , 9 , 0 , 4 , 0 , 0 },
                { 8 , 0 , 0 , 0 , 0 , 0 , 0 , 9 , 3 },
        };

        public static int[][] matrizMedio3 = {
                { 0 , 0 , 4 , 6 , 7 , 8 , 9 , 0 , 0 },
                { 0 , 3 , 0 , 0 , 0 , 0 , 0 , 5 , 0 },
                { 2 , 0 , 0 , 0 , 5 , 0 , 0 , 0 , 1 },
                { 5 , 0 , 0 , 4 , 0 , 6 , 0 , 0 , 9 },
                { 9 , 0 , 0 , 3 , 0 , 7 , 0 , 0 , 4 },
                { 3 , 0 , 2 , 0 , 0 , 0 , 8 , 0 , 6 },
                { 4 , 1 , 0 , 0 , 0 , 0 , 0 , 9 , 2 },
                { 0 , 9 , 0 , 0 , 0 , 0 , 0 , 6 , 0 },
                { 0 , 0 , 5 , 7 , 1 , 9 , 3 , 0 , 0 },
        };

        public static int[][] matrizMedio4 = {
                { 1 , 0 , 0 , 8 , 7 , 0 , 0 , 0 , 0 },
                { 0 , 6 , 0 , 0 , 9 , 4 , 0 , 0 , 0 },
                { 0 , 0 , 9 , 0 , 0 , 6 , 1 , 0 , 0 },
                { 6 , 0 , 0 , 7 , 0 , 0 , 2 , 1 , 0 },
                { 4 , 9 , 0 , 0 , 0 , 0 , 0 , 5 , 3 },
                { 0 , 2 , 1 , 0 , 0 , 5 , 0 , 0 , 6 },
                { 0 , 0 , 4 , 5 , 0 , 0 , 8 , 0 , 0 },
                { 0 , 0 , 0 , 9 , 6 , 0 , 0 , 7 , 0 },
                { 0 , 0 , 0 , 0 , 4 , 8 , 0 , 0 , 1 },
        };

        public static int[][] matrizMedio5 = {
                { 0 , 1 , 0 , 0 , 7 , 0 , 0 , 8 , 5 },
                { 0 , 2 , 3 , 4 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 5 , 0 , 0 , 0 , 9 , 0 , 3 , 0 , 1 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 7 , 0 , 1 , 0 , 2 , 0 , 0 , 0 , 4 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 5 , 4 , 6 , 0 },
                { 9 , 8 , 0 , 0 , 4 , 0 , 0 , 7 , 0 },
        };

        public static int[][] matrizMedio6 = {
                { 0 , 7 , 0 , 0 , 0 , 0 , 2 , 0 , 5 },
                { 2 , 0 , 9 , 0 , 5 , 4 , 0 , 0 , 6 },
                { 0 , 0 , 0 , 9 , 0 , 0 , 7 , 0 , 0 },
                { 0 , 6 , 8 , 0 , 2 , 0 , 0 , 0 , 0 },
                { 1 , 0 , 0 , 5 , 0 , 9 , 0 , 0 , 7 },
                { 0 , 0 , 0 , 0 , 1 , 0 , 8 , 2 , 0 },
                { 0 , 0 , 7 , 0 , 0 , 5 , 0 , 0 , 0 },
                { 8 , 0 , 0 , 3 , 7 , 0 , 5 , 0 , 2 },
                { 4 , 0 , 1 , 0 , 0 , 0 , 0 , 7 , 0 },
        };

        public static int[][] matrizMedio7 = {
                { 0 , 0 , 0 , 4 , 0 , 5 , 0 , 0 , 0 },
                { 4 , 9 , 0 , 0 , 0 , 0 , 0 , 7 , 5 },
                { 0 , 6 , 0 , 0 , 0 , 0 , 0 , 1 , 0 },
                { 6 , 0 , 8 , 0 , 1 , 0 , 3 , 0 , 7 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 7 , 0 , 9 , 0 , 4 , 0 , 1 , 0 , 6 },
                { 0 , 3 , 0 , 0 , 0 , 0 , 0 , 8 , 0 },
                { 5 , 1 , 0 , 0 , 0 , 0 , 0 , 6 , 2 },
                { 0 , 0 , 0 , 7 , 0 , 9 , 0 , 0 , 0 },
        };

        public static int[][] matrizMedio8 = {
                { 0 , 0 , 0 , 0 , 1 , 0 , 0 , 0 , 0 },
                { 8 , 0 , 4 , 0 , 0 , 0 , 1 , 0 , 7 },
                { 3 , 0 , 2 , 0 , 0 , 0 , 0 , 4 , 6 },
                { 0 , 4 , 0 , 0 , 5 , 0 , 0 , 0 , 0 },
                { 5 , 0 , 0 , 3 , 0 , 2 , 0 , 0 , 8 },
                { 0 , 0 , 0 , 0 , 4 , 0 , 0 , 1 , 0 },
                { 9 , 5 , 0 , 0 , 0 , 0 , 8 , 0 , 1 },
                { 1 , 0 , 7 , 0 , 0 , 0 , 9 , 0 , 4 },
                { 0 , 0 , 0 , 0 , 2 , 0 , 0 , 0 , 0 },
        };

        public static int[][] matrizMedio9 = {
                { 4 , 0 , 5 , 0 , 0 , 0 , 8 , 0 , 7 },
                { 1 , 0 , 8 , 0 , 0 , 0 , 4 , 0 , 9 },
                { 7 , 0 , 2 , 0 , 0 , 0 , 1 , 0 , 3 },
                { 6 , 8 , 3 , 0 , 0 , 0 , 7 , 9 , 5 },
                { 0 , 0 , 0 , 0 , 9 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 3 , 0 , 8 , 0 , 0 , 0 },
                { 3 , 0 , 6 , 0 , 0 , 0 , 5 , 0 , 2 },
                { 0 , 7 , 0 , 0 , 0 , 0 , 0 , 8 , 0 },
                { 0 , 0 , 0 , 5 , 3 , 4 , 0 , 0 , 0 },
        };

        public static int[][] matrizMedio10 = {
                { 7 , 0 , 0 , 1 , 0 , 0 , 8 , 0 , 5 },
                { 0 , 0 , 5 , 3 , 0 , 0 , 0 , 0 , 6 },
                { 0 , 9 , 0 , 0 , 6 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 1 , 2 , 0 , 0 },
                { 0 , 4 , 0 , 0 , 0 , 0 , 0 , 8 , 0 },
                { 0 , 0 , 3 , 7 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 4 , 0 , 0 , 6 , 0 },
                { 2 , 0 , 0 , 0 , 0 , 7 , 1 , 0 , 0 },
                { 9 , 0 , 6 , 0 , 0 , 5 , 0 , 0 , 4 },
        };

        public static int[][] matrizMedio11 = {
                { 0 , 0 , 0 , 0 , 0 , 9 , 0 , 0 , 3 },
                { 0 , 0 , 4 , 0 , 1 , 0 , 0 , 0 , 9 },
                { 3 , 9 , 0 , 7 , 8 , 0 , 0 , 0 , 4 },
                { 0 , 7 , 0 , 2 , 0 , 0 , 1 , 9 , 5 },
                { 0 , 0 , 8 , 6 , 0 , 1 , 4 , 0 , 0 },
                { 2 , 3 , 1 , 0 , 0 , 4 , 0 , 7 , 0 },
                { 7 , 0 , 0 , 0 , 9 , 3 , 0 , 4 , 1 },
                { 6 , 0 , 0 , 0 , 2 , 0 , 9 , 0 , 0 },
                { 1 , 0 , 0 , 4 , 0 , 0 , 0 , 0 , 0 },
        };

        public static int[][] matrizMedio12 = {
                { 0 , 4 , 0 , 1 , 0 , 0 , 3 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 9 , 0 , 0 , 1 , 2 },
                { 0 , 0 , 2 , 0 , 6 , 4 , 0 , 0 , 0 },
                { 0 , 7 , 1 , 0 , 0 , 0 , 8 , 0 , 4 },
                { 0 , 0 , 0 , 2 , 0 , 7 , 0 , 0 , 0 },
                { 6 , 0 , 8 , 0 , 0 , 0 , 5 , 7 , 0 },
                { 0 , 0 , 0 , 8 , 4 , 0 , 6 , 0 , 0 },
                { 9 , 1 , 0 , 0 , 2 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 4 , 0 , 0 , 1 , 0 , 9 , 0 },
        };

        public static int[][] matrizMedio13 = {
                { 3 , 0 , 5 , 7 , 0 , 1 , 0 , 0 , 0 },
                { 1 , 0 , 8 , 0 , 5 , 6 , 0 , 0 , 0 },
                { 0 , 7 , 0 , 0 , 0 , 0 , 0 , 4 , 0 },
                { 5 , 0 , 0 , 6 , 0 , 0 , 0 , 0 , 3 },
                { 0 , 0 , 0 , 5 , 7 , 2 , 0 , 0 , 0 },
                { 4 , 0 , 0 , 0 , 0 , 3 , 0 , 0 , 8 },
                { 0 , 3 , 0 , 0 , 0 , 0 , 0 , 5 , 0 },
                { 0 , 0 , 0 , 8 , 6 , 0 , 3 , 0 , 9 },
                { 0 , 0 , 0 , 1 , 0 , 5 , 8 , 0 , 7 },
        };

        public static int[][] matrizMedio14 = {
                { 6 , 2 , 3 , 0 , 0 , 4 , 0 , 0 , 0 },
                { 0 , 5 , 0 , 0 , 0 , 9 , 0 , 2 , 0 },
                { 0 , 0 , 1 , 7 , 0 , 0 , 0 , 5 , 3 },
                { 0 , 0 , 0 , 0 , 9 , 0 , 3 , 0 , 0 },
                { 2 , 0 , 0 , 6 , 1 , 7 , 0 , 0 , 5 },
                { 0 , 0 , 4 , 0 , 3 , 0 , 0 , 0 , 0 },
                { 3 , 6 , 0 , 0 , 0 , 5 , 1 , 0 , 0 },
                { 0 , 8 , 0 , 9 , 0 , 0 , 0 , 6 , 0 },
                { 0 , 0 , 0 , 2 , 0 , 0 , 8 , 3 , 9 },
        };

        public static int[][] matrizMedio15 = {
                { 8 , 0 , 0 , 0 , 7 , 0 , 2 , 4 , 0 },
                { 0 , 0 , 0 , 4 , 0 , 0 , 8 , 0 , 9 },
                { 0 , 0 , 6 , 0 , 0 , 8 , 0 , 3 , 0 },
                { 0 , 0 , 0 , 7 , 0 , 0 , 9 , 5 , 0 },
                { 2 , 0 , 0 , 0 , 4 , 0 , 0 , 0 , 7 },
                { 0 , 3 , 7 , 0 , 0 , 5 , 0 , 0 , 0 },
                { 0 , 9 , 0 , 1 , 0 , 0 , 5 , 0 , 0 },
                { 5 , 0 , 1 , 0 , 0 , 7 , 0 , 0 , 0 },
                { 0 , 7 , 8 , 0 , 9 , 0 , 0 , 0 , 1 },
        };

        public static int[][] matrizMedio16 = {
                { 4 , 0 , 0 , 1 , 0 , 2 , 0 , 0 , 7 },
                { 0 , 0 , 0 , 8 , 0 , 0 , 2 , 0 , 4 },
                { 0 , 9 , 0 , 0 , 0 , 0 , 0 , 3 , 5 },
                { 0 , 0 , 9 , 6 , 0 , 0 , 3 , 7 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 1 , 3 , 0 , 0 , 9 , 6 , 0 , 0 },
                { 3 , 6 , 0 , 0 , 0 , 0 , 0 , 1 , 0 },
                { 9 , 0 , 4 , 0 , 0 , 1 , 0 , 0 , 0 },
                { 7 , 0 , 0 , 4 , 0 , 8 , 0 , 0 , 3 },
        };

        public static int[][] matrizMedio17 = {
                { 9 , 0 , 0 , 0 , 6 , 0 , 0 , 7 , 2 },
                { 2 , 0 , 0 , 5 , 9 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 8 , 3 , 0 , 0 , 9 , 0 , 0 },
                { 0 , 0 , 0 , 2 , 0 , 6 , 3 , 9 , 0 },
                { 8 , 5 , 0 , 0 , 0 , 0 , 0 , 4 , 6 },
                { 0 , 9 , 3 , 8 , 0 , 4 , 0 , 0 , 0 },
                { 0 , 0 , 6 , 0 , 0 , 2 , 8 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 8 , 5 , 0 , 0 , 4 },
                { 5 , 8 , 0 , 0 , 4 , 0 , 0 , 0 , 9 },
        };

        public static int[][] matrizDificil = {
                {0,9,0,0,4,6,2,0,7},
                {1,7,2,0,0,3,0,8,0},
                {0,0,0,0,0,0,0,9,0},
                {0,0,0,0,0,0,3,0,9},
                {0,0,5,0,3,0,0,0,0},
                {0,6,0,0,0,0,0,2,0},
                {0,0,0,0,0,0,0,0,1},
                {0,0,4,2,5,0,8,0,0},
                {5,0,7,0,0,0,0,0,0},
        };
	
	        public  static  int [] [] matrizDificil2 = {
                { 0 , 0 , 6 , 5 , 9 , 7 , 3 , 0 , 0 },
                { 0 , 5 , 0 , 0 , 0 , 0 , 0 , 9 , 0 },
                { 9 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 8 },
                { 0 , 1 , 0 , 0 , 0 , 0 , 0 , 5 , 0 },
                { 0 , 0 , 9 , 0 , 0 , 0 , 7 , 0 , 0 },
                { 5 , 0 , 0 , 7 , 0 , 1 , 0 , 0 , 3 },
                { 0 , 2 , 0 , 0 , 3 , 0 , 0 , 8 , 0 },
                { 0 , 0 , 4 , 0 , 0 , 0 , 6 , 0 , 0 },
                { 0 , 0 , 0 , 9 , 6 , 4 , 0 , 0 , 0 },
        };

        public  static  int [] [] matrizDificil3 = {
                { 0 , 0 , 0 , 4 , 0 , 1 , 0 , 0 , 0 },
                { 0 , 0 , 2 , 0 , 0 , 0 , 1 , 0 , 0 },
                { 0 , 6 , 0 , 0 , 8 , 0 , 0 , 7 , 0 },
                { 4 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 9 },
                { 0 , 0 , 8 , 0 , 0 , 0 , 4 , 0 , 0 },
                { 7 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 5 },
                { 0 , 7 , 0 , 0 , 4 , 0 , 0 , 5 , 0 },
                { 0 , 0 , 9 , 0 , 0 , 0 , 3 , 0 , 0 },
                { 0 , 0 , 0 , 1 , 0 , 3 , 0 , 0 , 0 },
        };

        public  static  int [] [] matrizDificil4 = {
                { 0 , 2 , 5 , 0 , 0 , 0 , 0 , 9 , 0 },
                { 0 , 0 , 0 , 6 , 0 , 0 , 0 , 0 , 8 },
                { 6 , 0 , 0 , 0 , 3 , 1 , 7 , 4 , 2 },
                { 8 , 0 , 0 , 0 , 0 , 9 , 0 , 0 , 0 },
                { 0 , 6 , 1 , 0 , 7 , 0 , 2 , 5 , 0 },
                { 0 , 0 , 0 , 2 , 0 , 0 , 0 , 0 , 4 },
                { 2 , 3 , 6 , 9 , 5 , 0 , 0 , 0 , 7 },
                { 7 , 0 , 0 , 0 , 0 , 6 , 0 , 0 , 0 },
                { 0 , 9 , 0 , 0 , 0 , 0 , 4 , 3 , 0 },
        };

        public  static  int [] [] matrizDificil5 = {
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 3 , 0 , 8 , 5 },
                { 0 , 0 , 1 , 0 , 2 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 5 , 0 , 7 , 0 , 0 , 0 },
                { 0 , 0 , 4 , 0 , 0 , 0 , 1 , 0 , 0 },
                { 0 , 9 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 5 , 0 , 0 , 0 , 0 , 0 , 0 , 7 , 3 },
                { 0 , 0 , 2 , 0 , 1 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 4 , 0 , 0 , 0 , 9 },
        };

        public  static  int [] [] matrizDificil6 = {
                { 0 , 0 , 6 , 1 , 0 , 0 , 0 , 0 , 3 },
                { 0 , 0 , 0 , 0 , 4 , 7 , 1 , 0 , 0 },
                { 9 , 2 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 2 , 0 , 0 , 0 , 0 , 1 },
                { 5 , 0 , 9 , 0 , 0 , 0 , 2 , 0 , 6 },
                { 8 , 0 , 0 , 0 , 0 , 4 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 7 },
                { 0 , 0 , 8 , 7 , 9 , 0 , 0 , 0 , 0 },
                { 2 , 0 , 0 , 0 , 0 , 5 , 9 , 0 , 0 },
        };

        public  static  int [] [] matrizDificil7 = {
                { 0 , 0 , 0 , 7 , 0 , 0 , 0 , 0 , 0 },
                { 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 4 , 3 , 0 , 2 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 6 },
                { 0 , 0 , 0 , 5 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 4 , 1 , 8 },
                { 0 , 0 , 0 , 0 , 8 , 1 , 0 , 0 , 0 },
                { 0 , 0 , 2 , 0 , 0 , 0 , 0 , 5 , 0 },
                { 0 , 4 , 0 , 0 , 0 , 0 , 3 , 0 , 0 },
        };

        public  static  int [] [] matrizDificil8 = {
                { 0 , 0 , 0 , 0 , 7 , 0 , 0 , 0 , 0 },
                { 8 , 1 , 0 , 0 , 0 , 0 , 0 , 6 , 0 },
                { 4 , 0 , 0 , 0 , 0 , 3 , 0 , 0 , 0 },
                { 0 , 0 , 7 , 0 , 5 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 1 , 0 , 0 , 0 , 8 , 0 },
                { 0 , 2 , 0 , 0 , 0 , 0 , 3 , 0 , 0 },
                { 6 , 8 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 2 , 0 , 7 , 0 , 5 },
        };

        public  static  int [] [] matrizDificil9 = {
                { 0 , 0 , 0 , 7 , 2 , 0 , 1 , 9 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 4 , 8 },
                { 7 , 0 , 0 , 0 , 0 , 3 , 0 , 0 , 0 },
                { 6 , 0 , 0 , 0 , 0 , 5 , 0 , 0 , 0 },
                { 0 , 3 , 8 , 0 , 1 , 0 , 9 , 5 , 0 },
                { 0 , 0 , 0 , 8 , 0 , 0 , 0 , 0 , 4 },
                { 0 , 0 , 0 , 3 , 0 , 0 , 0 , 0 , 1 },
                { 4 , 5 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 6 , 2 , 0 , 5 , 8 , 0 , 0 , 0 },
        };

        public  static  int [] [] matrizDificil10 = {
                { 5 , 0 , 0 , 0 , 0 , 2 , 8 , 0 , 7 },
                { 0 , 8 , 9 , 0 , 0 , 5 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 9 , 0 , 0 , 1 , 5 },
                { 9 , 0 , 0 , 4 , 0 , 0 , 0 , 2 , 0 },
                { 0 , 0 , 8 , 0 , 0 , 0 , 7 , 0 , 0 },
                { 0 , 4 , 0 , 0 , 0 , 8 , 0 , 0 , 1 },
                { 6 , 9 , 0 , 0 , 8 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 2 , 0 , 0 , 1 , 6 , 0 },
                { 2 , 0 , 7 , 3 , 0 , 0 , 0 , 0 , 9 },
        };

        public  static  int [] [] matrizDificil11 = {
                { 8 , 0 , 0 , 4 , 0 , 7 , 0 , 0 , 9 },
                { 5 , 0 , 0 , 6 , 0 , 1 , 0 , 0 , 7 },
                { 4 , 0 , 0 , 3 , 0 , 8 , 0 , 0 , 5 },
                { 0 , 4 , 6 , 0 , 0 , 0 , 5 , 2 , 0 },
                { 0 , 7 , 5 , 0 , 6 , 0 , 8 , 9 , 0 },
                { 0 , 0 , 0 , 0 , 3 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 8 , 0 , 3 , 0 , 0 , 0 },
                { 0 , 0 , 4 , 0 , 0 , 0 , 3 , 0 , 0 },
                { 7 , 9 , 0 , 0 , 0 , 0 , 0 , 4 , 8 },
        };

        public  static  int [] [] matrizDificil12 = {
                { 0 , 0 , 5 , 0 , 0 , 1 , 0 , 0 , 6 },
                { 0 , 8 , 0 , 9 , 0 , 0 , 4 , 0 , 0 },
                { 7 , 0 , 0 , 0 , 8 , 0 , 0 , 9 , 0 },
                { 0 , 3 , 0 , 0 , 0 , 5 , 0 , 0 , 4 },
                { 0 , 0 , 8 , 0 , 0 , 0 , 5 , 0 , 0 },
                { 4 , 0 , 0 , 3 , 0 , 0 , 0 , 8 , 0 },
                { 0 , 4 , 0 , 0 , 3 , 0 , 0 , 0 , 1 },
                { 0 , 0 , 1 , 0 , 0 , 9 , 0 , 6 , 0 },
                { 8 , 0 , 0 , 1 , 0 , 0 , 3 , 0 , 0 },
        };

        public  static  int [] [] matrizDificil13 = {
                { 1 , 2 , 0 , 6 , 9 , 0 , 0 , 0 , 0 },
                { 7 , 0 , 6 , 0 , 0 , 3 , 0 , 1 , 0 },
                { 0 , 0 , 0 , 7 , 0 , 0 , 0 , 8 , 0 },
                { 0 , 0 , 0 , 5 , 0 , 0 , 2 , 0 , 4 },
                { 0 , 0 , 0 , 0 , 6 , 0 , 0 , 0 , 0 },
                { 8 , 0 , 4 , 0 , 0 , 7 , 0 , 0 , 0 },
                { 0 , 1 , 0 , 0 , 0 , 6 , 0 , 0 , 0 },
                { 0 , 7 , 0 , 3 , 0 , 0 , 4 , 0 , 1 },
                { 0 , 0 , 0 , 0 , 1 , 9 , 0 , 3 , 2 },
        };

        public  static  int [] [] matrizDificil14 = {
                { 6 , 0 , 0 , 0 , 0 , 3 , 7 , 0 , 0 },
                { 0 , 0 , 0 , 9 , 0 , 8 , 0 , 0 , 2 },
                { 3 , 0 , 0 , 4 , 0 , 0 , 0 , 6 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 6 , 9 , 0 },
                { 0 , 7 , 0 , 0 , 0 , 0 , 0 , 2 , 0 },
                { 0 , 4 , 6 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 5 , 0 , 0 , 0 , 9 , 0 , 0 , 4 },
                { 7 , 0 , 0 , 5 , 0 , 2 , 0 , 0 , 0 },
                { 0 , 0 , 9 , 8 , 0 , 0 , 0 , 0 , 5 },
        };

        public  static  int [] [] matrizDificil15 = {
                { 1 , 0 , 5 , 0 , 0 , 6 , 0 , 2 , 9 },
                { 6 , 0 , 0 , 0 , 3 , 0 , 0 , 0 , 0 },
                { 2 , 0 , 0 , 0 , 0 , 0 , 0 , 4 , 0 },
                { 0 , 0 , 7 , 5 , 0 , 3 , 0 , 1 , 4 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 3 , 2 , 0 , 1 , 0 , 9 , 5 , 0 , 0 },
                { 0 , 1 , 0 , 0 , 0 , 0 , 0 , 0 , 2 },
                { 0 , 0 , 0 , 0 , 7 , 0 , 0 , 0 , 3 },
                { 4 , 6 , 0 , 2 , 0 , 0 , 7 , 0 , 1 },
        };

        public  static  int [] [] matrizDificil16 = {
                { 2 , 0 , 0 , 4 , 1 , 3 , 6 , 8 , 0 },
                { 0 , 0 , 0 , 2 , 6 , 9 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 0 },
                { 0 , 0 , 1 , 0 , 0 , 0 , 0 , 9 , 0 },
                { 0 , 0 , 6 , 9 , 0 , 4 , 5 , 0 , 0 },
                { 0 , 8 , 0 , 0 , 0 , 0 , 3 , 0 , 0 },
                { 0 , 6 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
                { 0 , 0 , 0 , 1 , 4 , 7 , 0 , 0 , 0 },
                { 0 , 1 , 4 , 8 , 3 , 6 , 0 , 0 , 5 },
        };
        
        private int[][] tabuleiro;
        private int[][] gabarito;
        public static final int vazio = 0; // Células vazias serão indicadas pelo valor 0
        public static final int tamanho = 9; // Tamanho da matriz do tabuleiro Sudoku
        
        //Recebe uma "matriz jogo" como argumento e gera um novo tabuleiro
        public void criarNovoTabuleiro(int[][] tabuleiro) {
            this.tabuleiro = new int[tamanho][tamanho];
            
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    this.tabuleiro[i][j] = tabuleiro[i][j];
                }
            }

            criarCopiaTabuleiro();
        }

        //Cria uma cópia do tabuleiro
        public void criarCopiaTabuleiro() {
            gabarito = new int[tamanho][tamanho];
            
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                        if(tabuleiro[i][j]==vazio){
                                gabarito[i][j] = 0;
                        }else{
                                gabarito[i][j] = 1;
                        }
                }
            }
        }

        /*
        Imprime o tabuleiro no terminal
        Usa formatação ANSI para mudar cores
        "\033[47m" = fundo branco
        "\033[1;94m" = negrito azul
        "\033[1;97m" = negrito branco
        "\033[1;90m" = negrito preto
        "\033[1;91m" = negrito vermelho
        "\u001B[0;0;0m" = reset formatação
        */
        public void exibir() {
                String [] cabeçalho = {"  ","  "," L"," I"," N"," H"," A"," S","  ","  ","  "};
                int letra = 0;

                System.out.println("\n\033[1;120;20mTabuleiro:\033[0m\n");
                for (int i = 0; i < tamanho; i++) {
                        if(i==0){
                                System.out.println("\033[0;104m"+"\033[1;97m"+"\s\s\s\s\s\sC\sO\sL\sU\sN\sA\sS\s\s\s\s\s\s"+"\u001B[0;0;0m");
                                System.out.println("\033[0;104m"+"\033[1;97m"+"\s\s\s\s\s 1 2 3| 4 5 6| 7 8 9"+"\u001B[0;0;0m");
                        }
                        if((i % 3 == 0) && (i != 0)) {
                                //System.out.print("\033[0;104m" + "\033[1;97m" + "\s\s\s\s\s" + "\u001B[0;0;0m");
                                System.out.printf("\033[0;104m"+"\033[1;97m"+"%s\s-\s"+"\u001B[0;0;0m", cabeçalho[letra]);
                                System.out.println("\033[47m" + "\033[1;94m" + " - - - - - - - - - -" + "\u001B[0;0;0m");
                                letra ++;
                        }
                        for (int j = 0; j < tamanho; j++) {
                                if (j==0){
                                        System.out.printf("\033[0;104m"+"\033[1;97m"+"%s\s%d\s"+"\u001B[0;0;0m", cabeçalho[letra],(i+1));
                                        letra++;                
                                }
                                if((j % 3 == 0) && (j != 0)){
                                        System.out.print("\033[47m" + "\033[1;94m" + "|"+ "\u001B[0;0;0m");
                                }if(gabarito[i][j]==1){
                                        System.out.print("\033[47m" + "\033[1;94m" + " " + tabuleiro[i][j] + "\u001B[0;0;0m");
                                }if(gabarito[i][j]==0 && tabuleiro[i][j]==0){
                                        System.out.print("\033[47m" + "\033[1;97m" + " " + tabuleiro[i][j] + "\u001B[0;0;0m");
                                }if(gabarito[i][j]==0 && tabuleiro[i][j]!=0){
                                        System.out.print("\033[47m" + "\033[1;90m" + " " + tabuleiro[i][j] + "\u001B[0;0;0m");
                                }if (gabarito[i][j]==2){
                                        System.out.print("\033[47m" + "\033[1;91m" + " " + tabuleiro[i][j] + "\u001B[0;0;0m");    
                                }
                        }
                        System.out.println();
                }
                System.out.println();
        }

        public void inserir(int lin, int col, int valor){
                tabuleiro[lin][col] = vazio;
                validarPosicao(lin, col, valor);
                if(!validarPosicao(lin, col, valor)){
                        gabarito[lin][col] = 2;
                }else{
                        gabarito[lin][col] = vazio;
                }
                tabuleiro[lin][col] = valor;
        }

        public void checarTrocas(){
                for(int i = 0; i<tamanho; i++){
                        for(int j = 0; j<tamanho; j ++){
                                if(gabarito[i][j] == 2){
                                        int teste = tabuleiro[i][j];
                                        tabuleiro[i][j] = vazio;
                                        if(validarPosicao(i, j, teste)){
                                                gabarito[i][j] = vazio;
                                        }
                                        tabuleiro[i][j] = teste;
                                }
                        }
                }

        }
                
        public void remover(){
                for(int i = 0; i<tamanho; i++){
                        for(int j = 0; j<tamanho; j ++){
                                if(gabarito[i][j] == 2){
                                        tabuleiro[i][j] = vazio;
                                        gabarito[i][j] = vazio;
                                        return;
                                }
                        }
                }
        }

        public boolean sinalizarErro(){
                for(int i = 0; i<tamanho; i++){
                        for(int j = 0; j<tamanho; j ++){
                                if(gabarito[i][j] == 2){
                                        return true;
                                }
                        }
                }
                return false;
        }

        public boolean checarCelulaVazia(int lin, int col){
            if(gabarito[lin][col] != 1){
                return true;
            }else{
                return false;
            }
        }

        public boolean checarTabuleiroVazio(){
            for (int lin = 0; lin < tamanho; lin++) {
                for (int col = 0; col < tamanho; col++) {
                    // Busca por células vazias (0)
                    if (tabuleiro[lin][col] == vazio) {
                        return true;
                    }
                }
            }
            return false;
        }

        // Verifica se o valor inserido já foi usado na mesma linha
        private boolean checarLinha(int lin, int valor) { 
                for (int i = 0; i < tamanho; i++){
                        if (tabuleiro[lin][i] == valor){
                                return true;
                        }
                }
                return false;
        }    

        // Verifica se o valor inserido já foi usado na mesma coluna
        private boolean checarColuna(int col, int valor) {
                for (int i = 0; i < tamanho; i++){
                        if (tabuleiro[i][col] == valor){
                                return true;
                        }
                }
                return false;
        }

        // Verifica se o valor inserido já foi usado no mesmo quadrante
        private boolean checarQuadrante(int lin, int col, int valor) {      
                int l = lin - lin % 3; //de 0 a 2 retorna 0, de 3 a 5 retorna 3 e de 6 a 8 retorna 6.
                int c = col - col % 3;
                // Os números 0, 3 e 6 representam o inicio de cada quadrante.
                // O for irá percorrer todas as casas do quadrande de [l][c] a [l+3][c+3]
                for (int i = l; i < (l + 3); i++){
                        for (int j = c; j < (c + 3); j++){
                                if (tabuleiro[i][j] == valor){
                                        return true;
                                }
                        }
                }
                return false;
        }

        // Combina os métodos de validação de linha, coluna e quadrante para validar o valor inserido em uma posição
        public boolean validarPosicao (int lin, int col, int valor) {
		    return !checarLinha(lin, valor)  &&  !checarColuna(col, valor)  &&  !checarQuadrante(lin, col, valor);
    	}
        /*
        // Método para resolver o sudoku utilizando algoritmo de Backtraking.
        public boolean resolver() {
            for (int lin = 0; lin < tamanho; lin++) {
                for (int col = 0; col < tamanho; col++) {
                    // Busca por células vazias (0)
                    if (gabarito[lin][col] == vazio) {
                        // Tenta valores possiveis para a posição
                        for (int valor = 1; valor <= tamanho; valor++) {
                            if (validarPosicao(lin, col, valor)) {
                                // Valor corresponde as regras do sudoku
                                gabarito[lin][col] = valor;

                                if (resolver()) { // Faz o Backtraking chmando a função resolver recursivamente
                                    return true;
                                } else { // Se solução inválida, limpa a célula e continua
                                    gabarito[lin][col] = vazio;
                                }
                            }
                        }

                        return false;
                    }
                }
            }

            return true; // sudoku resolvido
	    }*/
    }
    
