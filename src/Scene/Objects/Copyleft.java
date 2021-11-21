package Scene.Objects;

import Scene.base.SceneObject;
import base.GraphicsObjects.Point4f;
import base.GraphicsObjects.Vector4f;
import base.objects3D.DisplayListTexCube;
import main.Engine;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;

import java.util.HashMap;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;

/**
 * @Author: WangYuyang
 * @Date: 2021/11/5-23:09
 * @Project: Assignment3
 * @Package: Scene.Objects
 * @Description:
 **/
public class Copyleft extends SceneObject {
    private DisplayListTexCube cube = new DisplayListTexCube();

    public Copyleft(Point4f origin, Point4f position, Vector4f scale) {
        super(origin, position, scale);
    }

    public Copyleft(Point4f origin, Point4f position, Vector4f scale, HashMap<String, Texture> textures) {
        super(origin, position, scale, textures);
    }

    public Copyleft(Point4f origin, Point4f position, Vector4f scale, Vector4f rotation, HashMap<String, Texture> textures) {
        super(origin, position, scale, rotation, textures);
    }

    @Override
    public void draw(Integer frame_delta) {
        GL11.glTexParameteri(
                GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T,
                GL11.GL_REPEAT);
        GL11.glTexParameteri(
                GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S,
                GL11.GL_REPEAT);
        Color.white.bind();
        //bind texture
        getTextures().get("copyleft").bind();
//        glBindTexture(GL_TEXTURE_2D, Engine.shadowTexture);
        ;
//        GL11.glDisable(GL11.GL_LIGHTING); // switch lighting off
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
        cube.DrawTexCube();
//        glBindTexture(GL_TEXTURE_2D, 0);
//        GL11.glEnable(GL11.GL_LIGHTING); // switch lighting off
        ;

    }
    @Override
    public void drawShadow() {

    }
}
