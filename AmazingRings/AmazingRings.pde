 int x1 = 250;
  int x2 = 0;
void setup(){
  size(500, 500);
 
}
void draw(){
  background(250, 250,250);
  fill(#0F0101);
  drawCircles(x1);
  drawCircles(x2);
  x1 = x1-1;
  x2 = x2+1;
}

void drawCircles(int x) {
    
  noFill();
  for(int i=20 ; i>0 ; i--){
 
  ellipse(x+250, 250, i*15 ,i*15);
 
  }
  
  
}