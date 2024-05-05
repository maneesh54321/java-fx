module first.java.fx.app {
	requires javafx.graphics;
	requires javafx.controls;
	opens com.ms.javafx to javafx.graphics;
}