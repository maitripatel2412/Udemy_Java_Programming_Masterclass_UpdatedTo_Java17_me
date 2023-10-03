package Section_12.Challenge;

public class GenericClassChallenge {
    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("yellowstone","44.4882, -110.5916"),
                new Park("grand canyon","36.1085, -112.0965"),
                new Park("yosemite","37.8855, -119.5360")
        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("mississippi","47.2160, -95.2348","29.1566, -89.2495","35.1556, -90.0659"),
                new River("missouri","45.9239, -111.4983","38.8146, -90.1218")

        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("colorado","45.9239, -111.4983","38.8146, -90.1218"),
                new River("delaware","45.9239, -111.4983","38.8146, -90.1218")
                );
        riverLayer.renderLayer();
    }
}
