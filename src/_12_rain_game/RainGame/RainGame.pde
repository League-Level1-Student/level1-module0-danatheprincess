int Yposition=0;
int Xposition=0;
int score=0;
void setup(){
  size(545,545);

  
}
void draw(){
  background(#CAE9F7);
      fill(#0A71A2);
    stroke(#2093C6);
    ellipse(Xposition,Yposition, 40, 40);
     Yposition+=2;
    if(Yposition>=height){
      Yposition=0;
      checkCatch(Xposition);
     Xposition = (int) random(width);
    }
    fill(#C9A1EA);
     rect( mouseX,400, 90, 100);
       fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    
}    void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
