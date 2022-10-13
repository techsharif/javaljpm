package section09;

public class InnerClass {

    private int item;

    public InnerClass(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "InnerClass{" +
                "item=" + item +
                '}';
    }

    public void print() {
        System.out.println("print");
        FirstInnerClass firstInnerClass = new FirstInnerClass(1);
        System.out.println(firstInnerClass);

        FirstInnerClass.SecondInnerClass secondInnerClass = firstInnerClass.new SecondInnerClass(2); // need to notice
        System.out.println(secondInnerClass);

        PrivateInnerClass privateInnerClass = new PrivateInnerClass(3); // we can access
        System.out.println(privateInnerClass);

        System.out.println(privateInnerClass.privateItem); // we also can access it
    }

    public class FirstInnerClass {
        private int firstItem;

        public FirstInnerClass(int firstItem) {
            this.firstItem = firstItem;
        }

        public int getFirstItem() {
            return firstItem;
        }

        @Override
        public String toString() {
            return "FirstInnerClass{" +
                    "firstItem=" + firstItem +
                    '}';
        }

        private class SecondInnerClass {
            private int secondItem;

            public SecondInnerClass(int secondItem) {
                this.secondItem = secondItem;
            }

            @Override
            public String toString() {
                return "SecondInnerClass{" +
                        "secondItem=" + secondItem +
                        '}';
            }

            public int getSecondItem() {
                return secondItem;
            }
        }

    }

    private class PrivateInnerClass {
        private int privateItem;

        public PrivateInnerClass(int privateItem) {
            this.privateItem = privateItem;
        }

        @Override
        public String toString() {
            return "PrivateInnerClass{" +
                    "privateItem=" + privateItem +
                    '}';
        }

        public int getPrivateItem() {
            return privateItem;
        }
    }
}
