package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "tutorial")
public class tutorial extends OpMode {

    DcMotor motor2br;
    DcMotor motor1bl;
    DcMotor motor4fl;
    DcMotor motor3fr;

    @Override
    public void init() {
        motor1bl = hardwareMap.get(DcMotor.class, "1bl");
        motor2br = hardwareMap.get(DcMotor.class, "2br");
        motor3fr = hardwareMap.get(DcMotor.class, "3fr");
        motor4fl = hardwareMap.get(DcMotor.class, "4fl");
        telemetry.addData("Initialization", "is a success!");
        telemetry.update();
    }

    @Override
    public void loop() {
        float x = gamepad1.left_stick_x;
        float y = gamepad1.left_stick_y;
        telemetry.addData("Initialization", String.format("%s %s", x, y));
        telemetry.update();
        if (gamepad1.left_stick_x == 0 && gamepad1.left_stick_y == -1) {
            motor1bl.setDirection(DcMotorSimple.Direction.REVERSE);
            motor1bl.setPower(1);
            motor2br.setDirection(DcMotorSimple.Direction.FORWARD);
            motor2br.setPower(1);
            motor3fr.setDirection(DcMotorSimple.Direction.FORWARD);
            motor3fr.setPower(1);
            motor4fl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor4fl.setPower(1);
            /* This codes the robot to go forward according to the toggle position of forward, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1
             */

        }
        if (gamepad1.left_stick_x == 0 && gamepad1.left_stick_y == 1) {
            motor1bl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor1bl.setPower(1);
            motor2br.setDirection(DcMotorSimple.Direction.REVERSE);
            motor2br.setPower(1);
            motor3fr.setDirection(DcMotorSimple.Direction.REVERSE);
            motor3fr.setPower(1);
            motor4fl.setDirection(DcMotorSimple.Direction.REVERSE);
            motor4fl.setPower(1);
            /* This codes the robot to go down according to the toggle position of down, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1*/
        }
        if (x < 0 && x > -1) {
            if (y > -1 && y < 0) {
                motor1bl.setDirection(DcMotorSimple.Direction.REVERSE);
                motor1bl.setPower(1);
                motor3fr.setDirection(DcMotorSimple.Direction.FORWARD);
                motor3fr.setPower(1);
                /* This codes the robot to travel along the top left diagonal, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1
                 */
            }

        }
        if (gamepad1.left_stick_x == -1 && gamepad1.left_stick_y == 0) {
            motor4fl.setDirection(DcMotorSimple.Direction.REVERSE);
            motor4fl.setPower(1);
            motor1bl.setDirection(DcMotorSimple.Direction.REVERSE);
            motor1bl.setPower(1);
            motor3fr.setDirection(DcMotorSimple.Direction.FORWARD);
            motor3fr.setPower(1);
            motor2br.setDirection(DcMotorSimple.Direction.REVERSE);
            motor2br.setPower(1);
            /* This codes the robot to travel left according to the toggle position of left, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1 */

        }
        if (x > -1 && x < 0) {
            if (y > 0 && y < 1) {
                motor4fl.setDirection(DcMotorSimple.Direction.REVERSE);
                motor4fl.setPower(1);
                motor2br.setDirection(DcMotorSimple.Direction.REVERSE);
                motor2br.setPower(1);
                /* This codes the robot to travel along the bottom left diagonal following the same position for toggle, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1 */
            }

        }
        if (x > 0 && x < 1) {
            if (y < 1 && y > 0) {
                motor1bl.setDirection(DcMotorSimple.Direction.FORWARD);
                motor1bl.setPower(1);
                motor3fr.setDirection(DcMotorSimple.Direction.REVERSE);
                motor3fr.setPower(1);
                /* This codes the robot to travel along the bottom right diagonal following the same position for toggle, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1 */

            }

        }
        if (gamepad1.left_stick_x == 1 && gamepad1.left_stick_y == 0) {
            motor4fl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor4fl.setPower(1);
            motor1bl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor1bl.setPower(1);
            motor3fr.setDirection(DcMotorSimple.Direction.REVERSE);
            motor3fr.setPower(1);
            motor2br.setDirection(DcMotorSimple.Direction.FORWARD);
            motor2br.setPower(1);
            /*This codes the robot to go right following the same toggle position, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1 */
        }
        if (x < 1 && x > 0) {
            if (y < 0 && y > -1) {
                motor4fl.setDirection(DcMotorSimple.Direction.FORWARD);
                motor4fl.setPower(1);
                motor2br.setDirection(DcMotorSimple.Direction.FORWARD);
                motor2br.setPower(1);
                /* This codes the robot to travel along the top right diagonal following the same toggle position, refer to this image to see what I mean:https://cdn11.bigcommerce.com/s-x56mtydx1w/images/stencil/original/products/2009/11014/3209-0012-0001-Product-Insight-2__22916__33180.1701994285.png?c=1 */

            }
        }
        motor3fr.setPower(0);
        motor2br.setPower(0);
        motor4fl.setPower(0);
        motor1bl.setPower(0);
    }
}