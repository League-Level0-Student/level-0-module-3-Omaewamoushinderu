void setup(){
  size(500, 500);
}
void draw() {
  for(int i=360 ; i>0 ; i--){
   noFill(); 
  ellipse(100,100, i,i);
  }
}