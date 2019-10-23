package ch03.ex07;

import java.util.Objects;

class ColorAttr extends Attr {
    private ScreenColor myColor;

    public ColorAttr(final String name, final Object value) {
        super(name, value);
        decodeColor();
    }

    public ColorAttr(final String name) {
        super(name, "trasparent");
    }

    public ColorAttr(final String name, final ScreenColor value) {
        super(name, value.toString());
        myColor = value;
    }

    public Object setValue(final Object newValue) {
        // スーパークラスの setValue を最初に行なう
        Object retval = super.setValue(newValue);
        decodeColor();
        return retval;
    }

    /** 値を記述ではなく ScreenColor に設定する */
    public ScreenColor setValue(ScreenColor newValue) {
        // スーパークラスの setValue を最初に行なう
        super.setValue(newValue.toString());
        ScreenColor oldValue = myColor;
        return oldValue;
    }

    /** 変換された ScreenColor オブジェクトを返す */
    public ScreenColor getColor() {
        return myColor;
    }

    protected void decodeColor() {
        if (getValue() == null) {
            myColor = null;
        } else {
            myColor = new ScreenColor(getValue());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorAttr)) {
            return false;
        }
        final ColorAttr castedComparison = (ColorAttr) o;
        if (!Objects.equals(this.myColor, castedComparison.getColor())) {
            return false;
        }
        if (!Objects.equals(this.getName(), castedComparison.getName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hashCode(this.getName()) + Objects.hashCode(this.myColor);
    }

    private final class ScreenColor{
        private String color;
        ScreenColor(Object value){
            this.color = (String) value;
        }

        public Object getColor() {
            return color;
        }

        @Override
        public boolean equals(Object o) {
            ScreenColor castedComparison = (ScreenColor) o;
            return Objects.equals(this.color, castedComparison.color);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.color);
        }
    }
}
