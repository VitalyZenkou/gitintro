package pizza.pizzaModel;

public class Calzone extends Pizza {

    private final boolean sauceIncide;

    private Calzone(Builder builder) {
        super(builder);
        this.sauceIncide = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceIncide=" + sauceIncide +
                '}';
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }
    }
}
