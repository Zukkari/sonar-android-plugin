class Record { // Noncompliant
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    Record(String a, String b, String c, String d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public static RecordBuilder builder() {
        return new RecordBuilder();
    }

    public static class RecordBuilder { // Noncompliant
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        RecordBuilder() {
        }

        public RecordBuilder a(String a) {
            this.a = a;
            return this;
        }

        public RecordBuilder b(String b) {
            this.b = b;
            return this;
        }

        public RecordBuilder c(String c) {
            this.c = c;
            return this;
        }

        public RecordBuilder d(String d) {
            this.d = d;
            return this;
        }

        public RecordBuilder e(String e) {
            this.e = e;
            return this;
        }

        public Record build() {
            return new Record(a, b, c, d, e);
        }

        public String toString() {
            switch (1) {
                case 1:
                    System.out.println("OK");
            }
            // This is a comment inside source code
            return "Record.RecordBuilder(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ")";
        }

        // This is a comment inside source code
        public String customMethod() {
            return "Hello, world!".concat("x").contains("y") + "";
        }
    }
}

