PImage pictureOfRecord;
int angle=0;
void setup(){
size(545,545);
pictureOfRecord= loadImage("record.png");
  pictureOfRecord.resize(height,width);
  
}
void draw(){
  rotateImage(pictureOfRecord,angle);
  image(pictureOfRecord, 0, 0);
  if(mousePressed){
 angle+=12;
  }
}
  void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
