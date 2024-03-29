int X= 10;
int Y=390;
void setup(){
   size(400, 400);
    background(0);
  
} 
void draw(){
  makeMagical();
  for(int i=0;i<=300;i++){
    fill(#D82121);
    ellipse(getWormX(i),getWormY(i),10,10);
  }
  
  
  
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
