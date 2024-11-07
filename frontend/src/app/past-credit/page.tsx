import { AddCourses } from "../components/courses/AddCourses";
import { Card } from "../components/ui/Card";
import { Navbar } from "../components/Navbar";

export default function PastCredit() {
    return (
        <div className="min-h-screen">
            <Navbar />
            <div className="m-16 -mt-16 grid grid-grow grid-rows-2 grid-cols-2 items-center justify-center pt-20 sm:mx-auto sm:w-[36rem] sm:rounded-full md:w-[41rem] lg:w-[53rem] xl:w-[73rem]">
                <div className="col-span-2">
                    <div className="text-[20px] font-bold">
                        Past Credit
                    </div>
                    <AddCourses />
                </div>
                <div className="">
                    <Card />
                </div>
                <div className="">
                    <Card />
                </div>
            </div>
        </div>
    )
}