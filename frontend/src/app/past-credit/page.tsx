import { AddCourses } from "../components/courses/AddCourses";
import { Navbar } from "../components/Navbar";

export default function PastCredit() {
    return (
        <div className="min-h-screen">
            <Navbar />
            <div className="grid grid-grow grid-cols-1 items-center justify-center pt-20">
                <div className="text-[20px] font-bold">
                    Past Credit
                </div>
                <AddCourses />
            </div>
        </div>
    )
}