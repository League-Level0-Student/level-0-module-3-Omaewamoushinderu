void setup(){
    ellipseMode(CENTER);
     size(500, 500);
     background(160, 160, 160);
     
  
}
  void draw() {
    for(int i=0 ; i<5 ; i++) {
      fill(#F1FA03);
    ellipse(i*20 , i*20 ,30,30);
    }
    for(int i=0 ; i<5 ; i++) {
    fill(#0A0A00);
    ellipse(i*23 , i*23, 30 , 30);
    }
  }