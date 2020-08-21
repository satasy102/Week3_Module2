class InsertionShort {
    public static void iShort(int[] arr){
        for(int i=1;i< arr.length;i++){
            System.out.println("\nVong lap thu "+i);
            int currentE=arr[i];
            System.out.println("Bien tam currerntE: "+currentE);
            int j;
            for(j=i-1;j>=0 && currentE<arr[j];j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=currentE;
            System.out.print("Mang da sap xep lan "+i+": ");
            for(int list:arr) System.out.print(list+" ");

        }

        System.out.print("\nMang sau khi da hoan tat sap xep: ");
        for(int list:arr) System.out.print(list+" ");
    }

    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -4};
        System.out.println("Mang ban dau");
        for(int lists:list) System.out.print(lists+" ");
        iShort(list);

    }
}
