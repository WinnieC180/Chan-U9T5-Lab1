import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer cast) {
        if (performers.indexOf(cast) == -1) {
            performers.add(cast);
            return true;
        }

        return false;
    }

    public boolean removePerformer(Performer cast) {
        if (performers.indexOf(cast) != -1) {
            performers.remove(cast);
            return true;
        }

        return false;
    }

    public double averagePerformerAge() {
        double average = 0;

        for (int i = 0; i < performers.size(); i++) {
            average += performers.get(i).getAge();
        }

        average /= performers.size();
        return average;
    }
    public ArrayList<Performer> performersOverAge(int age) {

        ArrayList <Performer> arr = new ArrayList<>();

        for (Performer cast : performers) {
            if (cast.getAge() >= age) {
                arr.add(cast);
            }
        }

        return arr;
    }

    public void groupRehearsal() {
        for (Performer performer : performers) {
            System.out.println("REHEARSAL CALL! " + performer.getName());
            if (performer instanceof Comedian) {
                Comedian fun = (Comedian) performer;
                fun.rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for (Performer performer : performers) {
            System.out.println("Welcome to the cabaret! Next act up. . . " + performer.getName());

            if (performer instanceof Dancer) {
                Dancer fun = (Dancer) performer;
                fun.pirouette(2);
                fun.perform();
            } else {
                performer.perform();
            }
        }
    }
}
