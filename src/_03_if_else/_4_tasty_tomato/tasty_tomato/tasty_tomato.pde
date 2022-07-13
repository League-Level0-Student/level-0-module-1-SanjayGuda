void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#ff0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#AF0505);
    rect(176, 103, 12, 32);
    fill(#FDFCFF);
    if(mousePressed){
      ellipse(98,200, 50,50);
    }
}