class cmdlineEx{

public static void main(String args[]){

if(args.length == 0){

System.out.println("please enter command line arguments");

}else{

for(int i=0; i<args.length; i++){

System.out.println("command line arguments are " +args[i]);
}
}
}
}